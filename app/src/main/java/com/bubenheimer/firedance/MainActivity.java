package com.bubenheimer.firedance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public final class MainActivity extends Activity {
//    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        final String iid = FirebaseInstanceId.getInstance().getId();
//        Log.i(TAG, "FirebaseInstanceId.getInstance().getId() == " + iid);

        startService(new Intent(this, FBService.class));

        finish();
    }
}
