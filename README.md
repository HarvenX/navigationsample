# navigationsample
用于展示Navigation 如何使用和传值

Navigation 和Activity 概念不一样，在这里，android 提供的是一个导航图的概念。 这个概念可以更加直观的表达页面之间的关系
和Activity 在代码中直接跳转的方式不同。 

所以他们的跳转 使用的是前进和后退的方式。 
前进的传值，使用SafeArg 可以直接传值。 会退的传值。利用Fragment Result API 可以进行传值。 

如果需要更复杂的协同，可以使用共享 ViewModel（目前Demo 中没有使用）
