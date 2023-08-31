var PickMe = 0;

if (mousePressedOver(BarleyCh)) {
    PickMe= 1;
}

if (PickMe == 1 && mousePressedOver(Play_Game)) {
    text("You've Picked Me!");
}