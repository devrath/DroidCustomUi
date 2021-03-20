![Banner](images/Logo-new.png)

# DroidCustomUi
This project demonstrates the use of preparing the custom ui components


**Demo Type** | **Files used** 
------------- | -------------- 
**Single level custom view** | [**Screen**](app/src/main/java/com/demo/code/ui/singleLevel/SingleLevelUiFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_single_level.xml) , [**CustomView**](app/src/main/java/com/demo/code/ui/custom/ErrorView.kt) , [**CustomViewContents**](app/src/main/res/layout/error_view.xml)
**Multi level custom view** | [**Screen**](app/src/main/java/com/demo/code/ui/multiLevel/MultiLevelUiFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_multi_level.xml) , [**FirstLevelLayout**](app/src/main/res/layout/parent_error_view.xml) , [**SecondLevelLayout**](app/src/main/res/layout/error_view.xml) , [**SecondLevelLayout**](app/src/main/res/layout/error_view.xml) , [**ParentErrorView**](app/src/main/java/com/demo/code/ui/custom/ParentErrorView.kt) , [**ChildErrorView**](app/src/main/java/com/demo/code/ui/custom/ErrorView.kt)
**Single level custom list view** | [**Screen**](app/src/main/java/com/demo/code/ui/singleLevelListView/SingleLevelListFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_single_level_list.xml) , [**Adapter**](app/src/main/java/com/demo/code/ui/custom/CustomListAdapter.kt) , [**CustomListClass**](app/src/main/java/com/demo/code/ui/custom/CustomListItems.kt)



**Demo Type** | **Description**
------------- | --------------
**Single level custom view** | Here there a custom view which is a error component having a `Tryagain` click button. We can just encapsulate the logic inside the custom class and expose the methods then use the custom component wherever needed in our project
**Multi level custom view** | Here the single level cusrom component is encapsulated in another level custom component called the parent component. Here whenever we we pass the event from our screen to parent custom component, it in-turn deligates to child if needed for child. This we can have any number of nested level of components that can be added
**Single level custom list view** | Here we deponstrate the encapsulation of listview in a custom component, Here we pass the data nd the callback to the custom list component, There is a interface implemented in the screen from adapter of the list using which adapter can send the selection of item events in adapter
