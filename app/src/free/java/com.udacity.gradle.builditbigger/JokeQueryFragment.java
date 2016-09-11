package com.udacity.gradle.builditbigger;

import android.app.ProgressDialog;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import static com.udacity.gradle.builditbigger.BuildConfig.*;


/**
 * A placeholder fragment containing a simple view.
 */
public class JokeQueryFragment extends Fragment implements View.OnClickListener{
    private InterstitialAd mInterstitialAd;
    private ProgressDialog spinner;
    public JokeQueryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        Button jokeButton = (Button) root.findViewById(R.id.joke_btn);
        jokeButton.setOnClickListener(this);
        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."

        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId(getContext().getString(R.string.add_id));

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
                tellJoke();
            }
        });

        requestNewInterstitial();

        AdRequest adRequest = new AdRequest.Builder()
            .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
            .build();
        mAdView.loadAd(adRequest);

        return root;
    }

    public void tellJoke(){
        spinner = new ProgressDialog(getContext());
        spinner.setMessage(getContext().getString(R.string.loading_joke));
        spinner.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        spinner.show();
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(new TaskListener() {
            @Override
            public void onTaskDone() {
               spinner.dismiss();
            }
        });
        endpointsAsyncTask.execute(getContext());
    }

    @Override
    public void onClick(View v) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            tellJoke();
        }
    }

    private void requestNewInterstitial() {
        if(FLAVOR.equals(getString(R.string.free_flavor))) {
            AdRequest adRequest = new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build();
            mInterstitialAd.loadAd(adRequest);
        }
    }
}
