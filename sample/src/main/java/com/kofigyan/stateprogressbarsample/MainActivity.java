package com.kofigyan.stateprogressbarsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.kofigyan.stateprogressbar.StateProgressBar;
import com.kofigyan.stateprogressbarsample.view.CircleProgressBar;

public class MainActivity extends Activity {

    private CircleProgressBar progressBar;
    private StateProgressBar stateProgressBar;
    String[] descriptionData = {"Details\ntest", "Status", "Photo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//        progressBar = (CircleProgressBar) findViewById(R.id.progressBar);
//
//        progressBar.setProgress(80);

        stateProgressBar = (StateProgressBar) findViewById(R.id.sate_progressbar);

        stateProgressBar.setProgress(60);
//        List<ApiFeature> features = getApiFeatures();
//
//        ApiFeatureAdapter adapter = new ApiFeatureAdapter(features, this);
//        recyclerView.setAdapter(adapter);
    }

//    private List<ApiFeature> getApiFeatures() {
//
//        List<ApiFeature> features = new ArrayList<>();
//
//        Resources res = getResources();
//        String[] titles = res.getStringArray(R.array.features_titles);
//        String[] descriptions = res.getStringArray(R.array.features_descriptions);
//
//        for (int i = 0; i < titles.length; i++) {
//            features.add(new ApiFeature(titles[i], descriptions[i]));
//        }
//
//        return features;
//    }

    public void click(View v){
//        progressBar.setProgressWithAnimation(100);
//        progressBar.setProgress(100);
        stateProgressBar.setProgressWithAnimation(100);
        stateProgressBar.setProgress(100);
        stateProgressBar.setStateDescriptionData(descriptionData);
    }

}
