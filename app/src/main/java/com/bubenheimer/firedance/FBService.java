package com.bubenheimer.firedance;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.iid.FirebaseInstanceId;

public class FBService extends Service {
    private static final String TAG = FBService.class.getSimpleName();

    @Override
    public void onCreate() {
        FirebaseApp.initializeApp(this, FirebaseOptions.fromResource(this));

        final String iid = FirebaseInstanceId.getInstance().getId();
        Log.i(TAG, "FirebaseInstanceId.getInstance().getId() == " + iid);

        stopSelf();
    }

    @Nullable
    @Override
    public IBinder onBind(final Intent intent) {
        return null;
    }
}
