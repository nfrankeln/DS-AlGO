// Time complexity O(n^2)
function selectionSort(array) { 
    
    for(let i= 0; i < array.length; i++){
      let minIndex = i;
  
      for (let j = i ; j < array.length ; j++){
        if (array[j]<array[minIndex]){
          minIndex = j;
        }
      }
      if( minIndex !== i){
        let temp = array[i];
        array[i] = array[minIndex];
        array[minIndex]=temp;
      }
    }
    
    return array;
  }
  console.log(selectionSort([5,2,1,50,23,12]))
