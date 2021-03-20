![Banner](images/Logo-new.png)

# DroidCustomUi
This project demonstrates the use of preparing the custom ui components

## Description
* Keeping the code decoupled as much as possible and having it resuable is one of the the important aspects of object oriented programming.
* While we use `view-model`,`service`,`repository` to seperate and keep the logics reusable, The UI layer also can be done similarly.
* Now One the the way of doing it is demostrated in the demo here with three varieties of use cases that are extensivey used by developers.

## Advantages
* Decoupled code 
* Reusable code in presentation logic
* Can fix bugs in one place and whereever the layer is used that gets reflected everywhere

## Disadvantages
* It consumes extra amount of time and effort to properly organize it 

## Files used per module in the project

**Demo Type** | **Files used** 
------------- | -------------- 
**Single level custom view** | [**Screen**](app/src/main/java/com/demo/code/ui/singleLevel/SingleLevelUiFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_single_level.xml) , [**CustomView**](app/src/main/java/com/demo/code/ui/custom/ErrorView.kt) , [**CustomViewContents**](app/src/main/res/layout/error_view.xml)
**Multi level custom view** | [**Screen**](app/src/main/java/com/demo/code/ui/multiLevel/MultiLevelUiFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_multi_level.xml) , [**FirstLevelLayout**](app/src/main/res/layout/parent_error_view.xml) , [**SecondLevelLayout**](app/src/main/res/layout/error_view.xml) , [**SecondLevelLayout**](app/src/main/res/layout/error_view.xml) , [**ParentErrorView**](app/src/main/java/com/demo/code/ui/custom/ParentErrorView.kt) , [**ChildErrorView**](app/src/main/java/com/demo/code/ui/custom/ErrorView.kt)
**Single level custom list view** | [**Screen**](app/src/main/java/com/demo/code/ui/singleLevelListView/SingleLevelListFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_single_level_list.xml) , [**Adapter**](app/src/main/java/com/demo/code/ui/custom/CustomListAdapter.kt) , [**CustomListClass**](app/src/main/java/com/demo/code/ui/custom/CustomListItems.kt)

## Description about the demo in project 

**Demo Type** | **Description**
------------- | --------------
**Single level custom view** | Here there a custom view which is a error component having a `Tryagain` click button.<br /> On click of try again button we show a toast
**Multi level custom view** | Here the single level custom component is encapsulated in another level custom component called the parent custom component. <br /> Whenever we pass the event from our screen to parent custom component, It in-turn deligates to child if needed for child. <br />This we can have any number of nested level of components that can be added
**Single level custom list view** | Here we deponstrate the encapsulation of listview in a custom component. <br />Here we pass the data nd the callback to the custom list component. <br />There is a interface implemented in the screen from adapter of the list using which adapter can send the selection of item events in adapter
