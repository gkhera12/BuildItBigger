package com.udacity.gradle.builditbigger;

import android.app.ProgressDialog;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A placeholder fragment containing a simple view.
 */
public class JokeQueryFragment extends Fragment implements View.OnClickListener{
    private ProgressDialog spinner;
    public JokeQueryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        Button jokeButton = (Button) root.findViewById(R.id.joke_btn);
        jokeButton.setOnClickListener(this);
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
            tellJoke();
    }

}
