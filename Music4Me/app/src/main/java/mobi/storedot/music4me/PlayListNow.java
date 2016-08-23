package mobi.storedot.music4me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlayListNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list_now);
        /**
         * Find the view that shows ListArtists category
         */
        TextView ListArtists = (TextView) findViewById(R.id.ListArtists);

        /**
         * Attach the clicklistener to the ListArtists view and create new object instance of the event listener
         */

        ListArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Define the event listener inline and the intent to ListArtists class for when the the user clicks on ListArtists view.
                 */
                Intent intent = new Intent(PlayListNow.this, ListArtists.class);
                startActivity(intent);
            }
        });

        /**
         * Find the view that shows SearchList category
         */
        TextView SearchMyList = (TextView) findViewById(R.id.SearchMyList);

        /**
         * Attach the clicklistener to the SearchList view and create new object instance of the event listener
         */

        SearchMyList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Define the event listener inline and the intent to SearchList class for when the the user clicks on SearchList view.
                 */
                Intent intent = new Intent(PlayListNow.this, SearchList.class);
                startActivity(intent);
            }
        });

        /**
         * Find the view that shows home MainActivity category
         */
        TextView home = (TextView) findViewById(R.id.Home);

        /**
         * Attach the clicklistener to the home MainActivity view and create new object instance of the event listener
         */

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Define the event listener inline and the intent to home MainActivity class for when the the user clicks on home MainActivity view.
                 */
                Intent intent = new Intent(PlayListNow.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
