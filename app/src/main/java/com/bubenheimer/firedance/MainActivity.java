package com.bubenheimer.firedance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public final class MainActivity extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startService(new Intent(this, FBService.class));
    }
}
