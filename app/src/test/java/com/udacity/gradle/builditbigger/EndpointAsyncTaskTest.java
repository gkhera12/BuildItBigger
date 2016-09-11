package com.udacity.gradle.builditbigger;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;
/**
 * Created by gkhera on 16/08/2016.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class,sdk=21)
public class EndpointAsyncTaskTest {

    @Test
    public void testTask(){
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(new TaskListener() {
            @Override
            public void onTaskDone() {

            }
        });
        Context context = RuntimeEnvironment.application.getApplicationContext();
        endpointsAsyncTask.execute(context);
        Robolectric.flushBackgroundThreadScheduler();
        try {
            assertNotNull(endpointsAsyncTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
