let input=document.querySelector('.list');
let addbtn=document.querySelector('.add-list');
let task=document.querySelector('.task');

//  lets start right funtion for it 

input.addEventListener('keyup',()=>{
    if(input.value.trim() !=0){
        addbtn.classList.add('active')
    }else{
        addbtn.classList.remove('active')
    }
})

// add new item to list

addbtn.addEventListener('click', () => {

    if(input.value.trim() !== 0){

        let newItem=document.createElement('div');
        newItem.classList.add('item');
        newItem.innerHTML =`
        <div class="todobox">
        <p> ${input.value} </p>
        <h3>Status:Pendiing </h3>
        <button class="r" id="remove"  >Remove</button>

        <button class="b" id="complet" onclick="changecolor('green');" >Mark Completed</button>
        <button id="end">End Task</button>
        </div>
        `
        task.appendChild(newItem);
        input.value= '';

    }
    else{
        alert('Please enter a task')
    }
})

function changecolor(newcolor){
    const chang=document.querySelector('.b');
  chang.style.backgroundColor=newcolor;
}

const removetask=document.querySelector('#remove');
