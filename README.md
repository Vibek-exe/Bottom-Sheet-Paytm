# Bottom-Sheet-Paytm

BottomSheetBehavior is applied to a child of CoordinatorLayout to make that child a persistent bottom sheet, which is a view that comes up from the bottom of the screen, elevated over the main content. It can be dragged vertically to expose more or less of their content.

## Setting state
Standard and modal bottom sheets have the following states:
* #### STATE_COLLAPSED: The bottom sheet is visible but only showing its peek height. This state is usually the 'resting position' of a bottom sheet, and should have enough height to indicate there is extra content for the user to interact with.
* #### STATE_EXPANDED: The bottom sheet is visible at its maximum height and it is neither dragging or settling
* #### STATE_HALF_EXPANDED: The bottom sheet is half-expanded (only applicable if behavior_fitToContents has been set to false), and is neither dragging or settling
* #### STATE_HIDDEN: The bottom sheet is no longer visible and can only be re-shown programmatically.
* #### STATE_DRAGGING: The user is actively dragging the bottom sheet up or down.
* #### STATE_SETTLING: The bottom sheet is settling to specific height after a drag/swipe gesture. This will be the peek height, expanded height, or 0, in case the user action caused the bottom sheet to hide.


### You can set a state on the bottom sheet like so:
bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED

### Note: STATE_SETTLING and STATE_DRAGGING should not be set programmatically.






https://user-images.githubusercontent.com/78261707/183703471-26552bfb-748a-430b-81f9-45bb586e817a.mp4



BottomSheetBehavior.from(binding.sheet).apply {
            peekHeight = 1000
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }

