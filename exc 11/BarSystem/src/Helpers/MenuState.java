package Helpers;

public enum MenuState {

    //TODO : add new order option jButton ->  1
    //TODO : add to existing order option jButton ->  2
    //TODO : show bill option jButton ->  3

    /**
     * Option 1 add new order option jButton ->  1
     * Option 2 add to existing order option jButton ->  2
     * Option 3 show bill option jButton ->  3
     */

    OPTION_ADD_NEW_ORDER(1),
    OPTION_ADD_TO_EXISTING_ORDER(2),
    OPTION_SHOW_BILL_FOR_CURRENT_TABLE(3);

    private final int value;

    MenuState(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }


}
