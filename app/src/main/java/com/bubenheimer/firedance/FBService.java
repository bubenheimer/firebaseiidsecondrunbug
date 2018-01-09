package com.bubenheimer.firedance;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.android.gms.iid.InstanceID;

public class FBService extends Service {
    private static final String TAG = FBService.class.getSimpleName();

    @Override
    public void onCreate() {
        final String iid = InstanceID.getInstance(this).getId();
        Log.i(TAG, "InstanceID.getInstance().getId() == " + iid);

        stopSelf();
    }

    @Nullable
    @Override
    public IBinder onBind(final Intent intent) {
        return null;
    }
}
