#include <iostream>
using namespace std;

int main() {
    // Manually allocate an array on the heap
    int* numbers = new int[5];
    
    for (int i = 0; i < 5; i++) {
        numbers[i] = i + 1;
    }
    
    cout << "Numbers: ";
    for (int i = 0; i < 5; i++) {
        cout << numbers[i] << " ";
    }
    cout << endl;
    
    // Manually free the allocated memory
    delete[] numbers;
    
    // If delete[] is omitted, this causes a memory leak
    
    cout << "Finished C++ memory management example." << endl;
    return 0;
}
