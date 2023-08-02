function bubbleSort(array) {
  // Only change code below this line
  
  for(let i = 0 ; i < array.length; i++){
    for(let j = 0 ; j < array.length - i; j++){
      let temp; 
      if(array[j] > array[j+1]){
        temp = array[j+1];
        array[j+1] = array[j];
        array[j] = temp;
      }
    }
  }
  

  return array;
  // Only change code above this line
}
//Compare the unsorted array with the sorted array using to string comparison
console.log(bubbleSort([39,95,27,67,31,44,92,60,82,5,62,55,23,11,22]).toString()===[5,11,22,23,27,31,39,44,55,60,62,67,82,92,95].toString())