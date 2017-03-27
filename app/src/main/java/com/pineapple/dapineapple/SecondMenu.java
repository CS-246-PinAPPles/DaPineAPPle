package com.pineapple.dapineapple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class SecondMenu extends AppCompatActivity {

    Toolbar sToolbar;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_menu);

        sToolbar = (Toolbar) findViewById(R.id.toolbar1);
        text = (TextView) findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            sToolbar.setTitle(bundle.getString("ItemName"));
            if(sToolbar.getTitle().toString().equalsIgnoreCase("Appetizers")){
                text.setText(
                        "    Coconut Shrimp (2) 6.95.\n\n\n" +
                                "    Lettuce Wraps (chicken) 8.95.\n\n\n" +
                                "    Lettuce Wraps (vegetarian w/tofu) 8.95.\n\n\n" +
                                "    Vegetable Tempura 5.95.\n\n\n" +
                                "    Gyoza (Asian pot stickers-6) 5.95.\n\n\n" +
                                "    Shrimp Tempura starter (2) 6.95.\n\n\n" +
                                "    Edamame (soy beans) 4.95.\n\n\n" +
                                "    Manapua (steamed pork buns) (2) 4.25.\n\n\n" +
                                "    Hiyashi Wakame (Asian Seaweed salad) 7.95.\n\n\n" +
                                "    Pork Egg rolls w/sweet chili sauce (2) 3.95.\n\n\n" +
                                "    Vegetarian Spring rolls w/sweet chili sauce (2) 3.25.");
                sToolbar.setSubtitle(bundle.getString("ItemName"));

            } else if(sToolbar.getTitle().toString().equalsIgnoreCase("Sushi")){
                text.setText(
                        "  A  dd a cup of Miso $2.95, Bowl 4.50.\n\n\n" +
                                "    Classic tuna roll 8.95.\n\n\n" +
                                "    Salmon Roll 8.95.\n\n\n" +
                                "    Sushi Mix Plate 10.95\n" +
                                "    Special 9 piece assorted\n" +
                                "    samplers prepared by our chef.\n\n\n" +
                                "    Hawaiian Roll w/sesame (aka CALIF. Roll) 6.75\n" +
                                "    Crab, avocado, cucumber, with a side of citrus sauce.\n\n\n" +
                                "    Coconut shrimp roll 8.95 Crispy coconut shrimp\n" +
                                "    made in house, with mango salsa, avocado, cream\n" +
                                "    cheese." +
                                "    Aloha roll 7.95 Teriyaki chicken, avocado topped\n" +
                                "    with sesame seeds. Served with side of teriyaki sauce.\n\n\n" +
                                "    Shrimp tempura roll 8.75 Deep fried shrimp and\n" +
                                "    avocado with sesame seeds. Served with side of citrus\n" +
                                "    sauce\n\n\n" +
                                "    Unagi w/sesame roll 8.95 Flavorful broiled eel,\n" +
                                "    avocado and cream cheese\n\n\n" +
                                "    Rainbow roll 12.95 Inside: Hawaii style roll. OutsideAssorted\n" +
                                "    fish, shrimp, and avocado across top of roll.\n\n\n" +
                                "    Seared Tuna roll 10.95 Seared pepper crusted tuna\n" +
                                "    in a roll with avocado. Side of spicy ginger lime sauce\n" +
                                "    included.\n\n\n" +
                                "    Spicy Tuna roll 8.95, Spicy Salmon roll 8.95\n" +
                                "    Cucumber added to spicy rolls.\n\n\n");

            } else if(sToolbar.getTitle().toString().equalsIgnoreCase("Delux Sushi")){
                text.setText(
                        "    Volcano Roll 11.95 Crab, cucumber, and avocado.\n" +
                                "    Sauteed shrimp in a sizzling aioli sauce poured over\n" +
                                "    the top of roll w/won ton crunchies.\n\n\n" +
                                "    Takahashi Roll 13.95 Spicy crab, scallions, hot\n" +
                                "    sauce inside roll. Topped with seared pepper\n" +
                                "    crusted tuna, avocado, served with side of spicy\n" +
                                "    ginger lime sauce.\n\n\n" +
                                "    Maile Roll 13.95 Inside roll: crab, shrimp, sweet\n" +
                                "    wasabi aioli sauce. Across top of roll- fresh tuna slices,\n" +
                                "    drizzled across with citrus sauce/sesame seeds.\n\n\n" +
                                "    Pau Hana roll 10.95 Spicy crab, cream cheese,\n" +
                                "    avocado inside. Roll is tempura, sliced, then topped\n" +
                                "    with our special house sauce, citrus sauce, and\n" +
                                "    crunchies.\n\n\n" +
                                "    Mango Moonlight 11.95 Crab, shrimp tempura,\n" +
                                "    mango, cream cheese, cucumber, avocado inside.\n" +
                                "    Topped with citrus/sesame seeds.\n\n\n" +
                                "    Keala Roll 13.95 Mahi mahi, spicy crab, mango\n" +
                                "    salsa, cream cheese. Tempura roll, topped with sweet\n" +
                                "    wasabi aioli sauce.\n\n\n" +
                                "    Eleena’s Specialty 15.00 Spicy salmon, cream\n" +
                                "    cheese, mango salsa, avocado inside. Roll is tempura,\n" +
                                "    then topped across with seared macadamia pepper\n" +
                                "    crusted tuna drizzled with special house sauce,\n" +
                                "    sesame seeds, and crunchies.\n\n\n" +
                                "    Big Kahuna Roll 14.00 Spicy crab, salmon, shrimp,\n" +
                                "    scallions inside roll. Tempura whole roll, then topped\n" +
                                "    with a layer of tuna, sprinkled with tobiko, sesame\n" +
                                "    seeds, and special house sauce.\n\n\n" +
                                "    Leialoha Roll 13.95 Shrimp tempura, spicy crab\n" +
                                "    inside. Topped across with tuna, avocado, drizzled\n" +
                                "    with dark sweet soy.\n\n\n");

            } else if(sToolbar.getTitle().toString().equalsIgnoreCase("Lunch Specials")){
                text.setText(
                        "                                      $6.95 LUNCH SPECIALS\n" +
                                "                                        11:30 - 2:00 PM, MWF\n\n" +
                                "                       Choice of steamed rice, fried rice, fries,\n" +
                                "                                                          OR\n" +
                                "                                 green salad or Macaroni salad\n\n\n" +
                                "    PL1 Sweet/Tangy Pineapple Chicken\n\n\n" +
                                "    PL2 Kalua Roast Pig (Hawaiian pulled pork)\n\n\n" +
                                "    PL3 Grilled Teriyaki Chicken\n\n\n" +
                                "    PL4 Pork Egg Rolls w/ sweet chili sauce\n\n\n" +
                                "    PL5 Gyoza w/dipping sauce\n\n\n" +
                                "    PL6 Vegetable Stir Fry\n\n\n" +
                                "    PL7 Hawaiian Chicken Curry\n\n\n" +
                                "    PL8 Vegetable Spring Rolls/dipping sauce\n\n\n" +
                                "    PL9 Beef Broccoli\n\n\n" +
                                "    PL10 Chicken Katsu (cutlet)\n\n\n" +
                                "    Sushi Lunch Special *\n\n\n" +
                                "    SL11 Sushi Lunch Plate - 5 piece Hawaii roll\n" +
                                "    aka (Calif. Roll), 1 inari pocket, 1 each tuna\n" +
                                "    and salmon nigiri. (*Does not include sides,\n" +
                                "    sushi only).");

            } else if(sToolbar.getTitle().toString().equalsIgnoreCase("Entrees")){
                text.setText(
                        "    Includes choice of steamed rice, fried rice,\n" +
                                "    or fries. *Add a green salad or mac salad for .1.25\n\n\n" +
                                "    Grilled Hawaiian Teriyaki Chicken 9.75\n" +
                                "    Chicken marinated to a tender, flavorful stage, and\n" +
                                "    grilled. Topped with teriyaki glaze.\n\n\n" +
                                "    Grilled Hawaiian Teriyaki Beef 11.95\n" +
                                "    Thin slices of beef marinated and grilled to perfection.\n\n\n" +
                                "    DA Grilled MIX PLATE 13.95\n" +
                                "    Get all three meats- combo of Kalua pig, Grilled teriyaki\n" +
                                "    chicken, and beef.\n\n\n" +
                                "    Hawaiian Mahi Mahi 14.95\n" +
                                "    Tender moist mahi mahi dipping in panko bread\n" +
                                "    crumbs, then deep fried to a golden crisp. Served with\n" +
                                "    lemon garlic aioli sauce, with a side of tempura\n" +
                                "    vegetables.\n\n\n" +
                                "    Shrimp Tempura 16.95\n" +
                                "    Traditional Japanese style lightly battered shrimp, fried\n" +
                                "    to a golden crisp. Served with tempura vegetables, and\n" +
                                "    dipping sauce.\n\n\n" +
                                "    Da Pineapple Chicken 10.95\n" +
                                "    Flavorful chicken dipped in batter, fried to a tender\n" +
                                "    crisp, and served with a sweet and tangy pineapple\n" +
                                "    sauce, and tempura veggies.\n\n\n" +
                                "    Kauai Combo 15.95\n" +
                                "    Grilled teriyaki beef, chicken katsu, and shrimp tempura\n" +
                                "    with sweet/tangy pineapple sauce.\n" +
                                "    Hula Stir Fry Stir fry noodles with selected vegetables\n" +
                                "    9.25, Add beef 9.95, Add Chicken 9.75, Add Shrimp\n" +
                                "    10.50, Add Tofu 9.75,\n\n\n" +
                                "    Kalua Pig Plate 10.50\n" +
                                "    Hawaiian style slow cooked pulled roast pork, served\n" +
                                "    with side of gravy.\n\n\n" +
                                "    Sesame Chicken Strips 10.95\n" +
                                "    Crisp and golden with a light honey sesame\n" +
                                "    glaze. Served with tasty guava dijon mustard\n" +
                                "    dipping sauce.\n\n\n" +
                                "    LOCO- MOCO 9.95\n" +
                                "    Island favorite dish with a generous scoop of\n" +
                                "    rice, grilled hamburger patty, two eggs over easy,\n" +
                                "    loaded with gravy.\n\n\n" +
                                "    Chicken Katsu 10.95\n" +
                                "    Lightly breaded crispy chicken, served with\n" +
                                "    tonkatsu creamy dipping sauce.\n\n\n" +
                                "    Micah’s Mix 15.95 Pineapple chicken katsu,\n" +
                                "    (sweet/tangy pineapple sauce over\n" +
                                "    crispy chicken cutlet), roast hawaiian kalua\n" +
                                "    pork, and a side of coconut shrimp.\n\n\n" +
                                "    Oivin’s Plate 15.95 Kalua pig, grilled\n" +
                                "    teri-chicken, and Hawaiian Mahi mahi.\n\n\n" +
                                "    Hawaiian Curry on Rice Chicken 9.25, Beef 9.75,\n" +
                                "    Shrimp 10.95, Veggie 8.95, *Spicy available\n\n\n" +
                                "    Coconut Shrimp Platter 15.95 Light home made\n" +
                                "    batter with a golden crisp crunch makes coconut\n" +
                                "    shrimp dish a favorite. Includes guava dijon\n" +
                                "    mustard dipping sauce.\n\n\n" +
                                "    Bento Box Special 14.95 Choice of Teriyaki\n" +
                                "    chicken or beef, 3 pc gyoza, 5 pc Hawaii sushi\n" +
                                "    roll, and 1 shrimp tempura w/tempura vegetables\n" +
                                "    and dipping sauce.\n\n\n" +
                                "    Crispy Lemon Chicken 11.95 Light and crispy\n" +
                                "    with lemon sauce drizzled across top with a\n" +
                                "    side of fresh steamed vegetables.\n\n\n" +
                                "    Saimin 8.95 Noodles from Hawaii simmered in\n" +
                                "    tasty broth, cabbage, green onions broccoli,\n" +
                                "    carrots, and two won-ton dumplings. Add shrimp\n" +
                                "    tempura 11.75, Add teri-chicken 9.50.\n" +
                                "    Add teri-beef 9.75.\n\n\n" +
                                "    HawaiianSpam Musubi 5.50, Teri chix musubi 5.75\n");

            } else if(sToolbar.getTitle().toString().equalsIgnoreCase("Specialty Salads")){
                text.setText(
                        "    Aloha Crispy Chicken Salad 10.50\n" +
                                "    Sliced tender crispy chicken breast with selected\n" +
                                "    fresh greens and veggies, fresh pineapple bits with\n" +
                                "    crunchy toppings.\n\n\n" +
                                "    Seared Fresh Ahi Tuna and Avocado Salad 13.95\n" +
                                "    Seared fresh ahi tuna and avocado sliced and placed\n" +
                                "    on a bed of romaine lettuce, cucumber, and green\n" +
                                "    onions. Side of sesame ginger dressing and lemon.\n\n\n" +
                                "    Spicy Crab and Shrimp Salad 11.95\n" +
                                "    Spicy crab salad, shrimp, avocado, and cucumbers on\n" +
                                "    a fresh bed of greens with a sliced lime wedge.");

            } else if(sToolbar.getTitle().toString().equalsIgnoreCase("Burgers and Sandwiches")){
                text.setText(
                        "    *All sandwiches include fries - *Real Cheddar\n" +
                                "    Cheese fries available, add 1.75\n\n\n" +
                                "    Da Big Tiki Burger 10.95\n" +
                                "    10 ounce Grilled teriyaki beef patty, melted cheddar\n" +
                                "    cheese, topped with sauteed mushrooms, crisp\n" +
                                "    tempura onions, smoked bacon, avocado, lettuce on a\n" +
                                "    bun. Served with a side of grilled pineapple.\n\n\n" +
                                "    Grilled Teriyaki Burger 8.95\n" +
                                "    A flavorful burger grilled to perfection. Served with\n" +
                                "    melted cheddar cheese, lettuce, and tomato on a bun.\n\n\n" +
                                "    Teriyaki Chicken Burger 8.75\n" +
                                "    Marinated Hawaiian style, then grilled to perfection.\n" +
                                "    Melted cheddar cheese, lettuce, and tomato/bun.\n\n\n" +
                                "    Kalua Pork Sandwich 9.25\n" +
                                "    Slow cooked pulled roast pork prepared island style.\n" +
                                "    Stuffed in a hoagie bun. Served with side of bbq\n" +
                                "    sauce or gravy. (Request for grilled onions if desired.)\n" +
                                "    Burger and Sandwiches (cont.)\n\n\n" +
                                "    Crispy Chicken Sandwich 9.25\n" +
                                "    Crispy chicken filled with melted cheddar cheese,\n" +
                                "    avocado, lettuce, and tomato, served with a side\n" +
                                "    of ranch dipping sauce.\n\n\n" +
                                "    Hawaiian Mahi Mahi Fish Sandwich 9.95\n" +
                                "    Lightly breaded panko style mahi deep fried to a\n" +
                                "    tender crisp. Served with lemon garlic aioli sauce\n" +
                                "    and lettuce.");

            } else if(sToolbar.getTitle().toString().equalsIgnoreCase("Deserts")){
                text.setText(
                        "    Da Volcano Cake 7.25\n\n\n" +
                                "    Huckleberry white chocolate Cheesecake w/\n" +
                                "    macadamia nut crust 6.75\n\n\n" +
                                "    Mango Guava Cheesecake w/ macadamia\n" +
                                "    nut crust 6.75\n\n\n" +
                                "    Tempura banana w/vanilla ice cream 6.45\n\n\n" +
                                "    Lilikoi chiffon pie 4.25 slice, *Limited-Fri/Sat only");
            }
        }
    }
}
