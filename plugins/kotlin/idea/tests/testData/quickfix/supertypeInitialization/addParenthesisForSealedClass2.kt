// "Change to constructor invocation" "true"
// ACTION: Add full qualifier
// ACTION: Change to constructor invocation
// ACTION: Introduce import alias

class My {
    sealed class A

    class B : A<caret>
}

// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.SuperClassNotInitialized$AddParenthesisFix