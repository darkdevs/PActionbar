package example.pactionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.dpouya.pactionbar.Model.PActionbarButton;
import com.dpouya.pactionbar.Ui.PActionbar;
import com.dpouya.pactionbar.helper.LayoutUtilities;

public class CenterActionbarTextActivity extends AppCompatActivity {

    private PActionbar pActionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout=new FrameLayout(this);
        pActionbar=new PActionbar(this);
        pActionbar.setBackgroundColor(0xff0d47a1);

        pActionbar.showBackButton(true);
        pActionbar.setOnIconClick(v -> finish());
        pActionbar.setCenteredText("CenterTitle", Typeface.DEFAULT_BOLD,20);


        pActionbar.addButton(new PActionbarButton(null, getResources().getDrawable(R.drawable.ic_search), v -> Toast.makeText(CenterActionbarTextActivity.this,"Toast2 Button",Toast.LENGTH_SHORT).show()));

        frameLayout.addView(pActionbar, LayoutUtilities.createFrame(LayoutUtilities.MATCH_PARENT,LayoutUtilities.WRAP_CONTENT, Gravity.TOP));


        setContentView(frameLayout);
    }
}