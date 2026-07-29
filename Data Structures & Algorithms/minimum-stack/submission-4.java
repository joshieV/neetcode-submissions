class MinStack {

    private Deque<int[]> stack = new ArrayDeque<>();

    public MinStack() {
        //I left the constructor empty because the stack starts empty meaning there is no value or minimum to calculate until push() is called.
    }

    public void push(int value) {
        int min;

        if (stack.isEmpty()) {
            min = value;
        } else {
            min = Math.min(value, stack.peek()[1]);
        }

        stack.push(new int[]{value, min});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}