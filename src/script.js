const carousels = document.querySelectorAll('.carousel');
for (let i = 0; i < carousels.length; i++) {
    const carousel = new bootstrap.Carousel(carousels[i], {
        interval: 2000,
        touch: false
    })
}