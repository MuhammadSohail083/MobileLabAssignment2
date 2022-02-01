package com.example.namazreminder.activities.preferences;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.namazreminder.R;
import com.example.namazreminder.fragments.preferences.ReminderPreferencesFragment;

public class ReminderPreferencesActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminderpreferences);

        ReminderPreferencesFragment reminderPreferencesFragment = new ReminderPreferencesFragment();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout_reminderPreferencesContainer, reminderPreferencesFragment)
                .commit();
    }
}
