async function addItem(userCart, item) {
    userCart.push(item);
}

async function deleteItem(userCart, name) {
    const index = userCart.findIndex((item) => item.name === name);

    if(index !== -1) {
        userCart.splice(index, 1);
    }
}

async function removeItem(userCart, index) {
    const deleteIndex = index - 1;
    
    if(index >= 0 && index < userCart.length) {
        userCart.splice(deleteIndex, 1);
    }
}

async function displayCart(userCart) {
    console.log("\nShopee cart list:");
    userCart.forEach((item, index) => {
        console.log(`${index + 1}. ${item.name} - R$ ${item.price} | ${item.quantity}x | Subtotal ${item.subtotal()}`);
    });
}

async function calculateTotal(userCart) {
    console.log("\nShopee Cart TOTAL IS:");
    const result = userCart.reduce((total, item) => total + item.subtotal(), 0);
    console.log(`🛒 Total: ${result}`);
}

export {
    addItem,
    deleteItem,
    displayCart,
    removeItem,
    calculateTotal
};