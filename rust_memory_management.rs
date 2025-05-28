fn main() {
    // Allocate a vector on the heap
    let numbers = vec![1, 2, 3, 4, 5];
    
    // Borrow a slice of the vector
    let slice = &numbers[1..3];
    
    println!("Slice: {:?}", slice);
    
    // Ownership example: numbers owns the vector
    // When 'numbers' goes out of scope, memory is freed automatically
}
