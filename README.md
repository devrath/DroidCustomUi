![Banner](images/Logo-new.png)

# DroidCustomUi
This project demonstrates the use of preparing the custom ui components


**Demo Type** | **Files used**
------------ | -------------
**Single level custom view** | [**Screen**](app/src/main/java/com/demo/code/ui/singleLevel/SingleLevelUiFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_single_level.xml) , [**CustomView**](app/src/main/java/com/demo/code/ui/custom/ErrorView.kt) , [**CustomViewContents**](app/src/main/res/layout/error_view.xml)
**Multi level custom view** | [**Screen**](app/src/main/java/com/demo/code/ui/multiLevel/MultiLevelUiFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_multi_level.xml) , [**FirstLevelLayout**](app/src/main/res/layout/parent_error_view.xml) , [**SecondLevelLayout**](app/src/main/res/layout/error_view.xml) , [**SecondLevelLayout**](app/src/main/res/layout/error_view.xml) , [**ParentErrorView**](app/src/main/java/com/demo/code/ui/custom/ParentErrorView.kt) , [**ChildErrorView**](app/src/main/java/com/demo/code/ui/custom/ErrorView.kt)
**Single level custom list view** | [**Screen**](app/src/main/java/com/demo/code/ui/singleLevelListView/SingleLevelListFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_single_level_list.xml) , [**Adapter**](app/src/main/java/com/demo/code/ui/custom/CustomListAdapter.kt) , [**CustomListClass**](app/src/main/java/com/demo/code/ui/custom/CustomListItems.kt)
