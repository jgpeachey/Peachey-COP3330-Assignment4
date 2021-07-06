package ucf.assignments;

import javafx.event.ActionEvent;

public class GuiCentral {

    FileCentral fl = new FileCentral();
    ListCentral todo = new ListCentral();

//Main Window
    public void clickedNewList(ActionEvent actionEvent) {
        //open Title Window so user can input the list title
        //open List Window so user can input items
    }

    public void clickedEditList(ActionEvent actionEvent) {
        //store list name that was selected as a string
        //open List Window so user can input items
    }

    public void clickedLoad(ActionEvent actionEvent) {
        //store list name that was selected as a string
        //open Load Window so user can input load info
    }

    public void clickedSave(ActionEvent actionEvent) {
        //store list name that was selected as a string
        //open Save Window so user can input save info
    }

    public void clickedEditTitle(ActionEvent actionEvent) {
        //store list name that was selected as a string
        //open Title Window so user can input the list title
    }

    public void clickedRemoveList(ActionEvent actionEvent) {
        //store list name that was selected as a string
        //call removeList() from ListCentral
    }

//Title Window
    public void clickedSaveTitle(ActionEvent actionEvent) {
        //if opened from clickedEditTitle
            //get stored name
            //store text box input as a string
            //call editListTitle() from ListCentral
            //exit window
        //else
            //store text box input as a string
            //call newList() from ListCentral
    }

//Save Window
    public void clickedSaveFile(ActionEvent actionEvent) {
        //store text box input as string
        //if choice box is set to all then call saveAll() from FileCentral
        //else call saveSingleList from FileCentral
        //exit window
    }

//Load Window
    public void clickedLoadFile(ActionEvent actionEvent) {
        //store text box input as string
        //if check box is checked call
        //else call loadSingleList() from FileCentral
        //exit window
    }

//List Window
    public void clickedNewItem(ActionEvent actionEvent) {
        //open Item Window so user can input item info
    }

    public void clickedRemoveItem(ActionEvent actionEvent) {
        //store item name that was selected as a string
        //call removeItem() from ListCentral
    }

    public void clickedItemInfo(ActionEvent actionEvent) {
        //store item name that was selected as a string
        //open Item Window so user can view/change item info
    }

    public void clickedSort(ActionEvent actionEvent) {
        //store choice box selection as a string
        //call sortItems() from ListCentral
        //refresh window
    }

    public void clickedComplete(ActionEvent actionEvent) {
        //store item name that was selected as a string
        //call markComplete() from ListCentral
    }

    public void clickedIncomplete(ActionEvent actionEvent) {
        //store item name that was selected as a string
        //call markIncomplete() from ListCentral
    }

//Item Window
    public void clickedSaveItem(ActionEvent actionEvent) {
        //if opened from clickedItemInfo
            //get stored name
            //store description text box input as string
            //store date text box input as string
            //call editItemInfo() from ListCentral
        //else
            //store name text box input as string
            //store description text box input as string
            //store date text box input as string
            //call addItem() from ListCentral
        //exit window
    }
}
