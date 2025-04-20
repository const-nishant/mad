
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etAge, etMobileNumber;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize EditText fields and Button
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etMobileNumber = findViewById(R.id.etMobileNumber);
        btnDisplay = findViewById(R.id.btnDisplay);

        // Set an OnClickListener to the Button
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get text from EditText fields
                String name = etName.getText().toString();
                String age = etAge.getText().toString();
                String mobileNumber = etMobileNumber.getText().toString();

                // Display the information using Toast
                String message = "Name: " + name + "\nAge: " + age + "\nMobile Number: " + mobileNumber;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
