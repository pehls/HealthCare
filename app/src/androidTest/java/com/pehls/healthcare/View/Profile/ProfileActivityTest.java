package com.pehls.healthcare.View.Profile;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;
import android.widget.TextView;

import com.pehls.healthcare.R;

/**
 * Created by gabri on 27/11/2017.
 */

public class ProfileActivityTest extends ActivityUnitTestCase<ProfileActivity> {
    public ProfileActivityTest() {
        super(ProfileActivity.class);
    }
    private ProfileActivity activity;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        Intent intent = new Intent(getInstrumentation().getTargetContext(), ProfileActivity.class);
        startActivity(intent, null, null);

        activity = getActivity();
    }

    public void testDevePossuirBotaoOk() throws Exception {
        Button ok_btn = (Button) activity.findViewById(R.id.ok_button);

        assertNotNull(ok_btn);
    }

    public void testDevePossuirTextView() throws Exception {
        TextView textView = (TextView) activity.findViewById(R.id.name_textView);

        assertNotNull(textView);
    }
}
