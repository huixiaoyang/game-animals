package mg.studio.game.animals;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2018\3\26 0026.
 */

public class CongratulateActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulate);
    }

    public void btnReplay(View view) {
        //to do when the button is clicked
        startActivity(new Intent(CongratulateActivity.this, MainActivity.class));
    }
}
