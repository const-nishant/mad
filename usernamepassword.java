import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText etUser, etPass;
    Button btnSubmit;
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPass);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvDisplay = findViewById(R.id.tvDisplay);
        btnSubmit.setOnClickListener(v -> {
            String user = etUser.getText().toString();
            String pass = etPass.getText().toString();
            tvDisplay.setText("Username: " + user + "\nPassword: " + pass);
        });
    }
}
