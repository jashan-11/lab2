import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch switchFlagAndButtons = findViewById(R.id.switchFlagAndButtons);
        final LinearLayout linearLayoutButtons = findViewById(R.id.linearLayoutButtons);
        final ImageView imageViewCanadianFlag = findViewById(R.id.imageViewCanadianFlag);

        switchFlagAndButtons.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    linearLayoutButtons.setVisibility(LinearLayout.VISIBLE);
                    imageViewCanadianFlag.setVisibility(ImageView.VISIBLE);
                } else {
                    linearLayoutButtons.setVisibility(LinearLayout.GONE);
                    imageViewCanadianFlag.setVisibility(ImageView.GONE);
                }
            }
        });
    }
}
