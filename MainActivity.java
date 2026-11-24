package com.finders.crm;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;

public class MainActivity extends Activity {
    private static final String CRM_URL = "https://script.google.com/macros/s/AKfycbySvkhLrIl_krpoZvJEkLX3QDCYeBw0HOV_E5gsK0xgxL9DTceYsyrvVes5_-NZOVuMtg/exec?view=mobile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            CustomTabsIntent tabs = new CustomTabsIntent.Builder()
                .setShowTitle(true)
                .build();
            tabs.launchUrl(this, Uri.parse(CRM_URL));
        } catch (Exception e) {
            startActivity(new android.content.Intent(
                android.content.Intent.ACTION_VIEW, Uri.parse(CRM_URL)));
        }
        finish();
    }
}
