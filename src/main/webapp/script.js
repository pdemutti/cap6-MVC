  
  const swiper = new Swiper('.swiper-container', {
    
    // Optional parameters
    direction: 'horizontal',
    // loop: true,
  
    // If we need pagination
    pagination: {
      el: '.swiper-pagination',
    },
  
    // Navigation arrows
    navigation: {
      nextEl: '.swiper-button-next',
      prevEl: '.swiper-button-prev',
    },
    centerInsufficientSlides: true,
       // Default parameters   
  
   // Responsive breakpoints   
   breakpoints: {  
  
      // when window width is <= 480px     
      480: {       
         slidesPerView: 1,       
         spaceBetween: 20     
      },   
  
      // when window width is <= 640px     
      640: {       
         slidesPerView: 2,       
         spaceBetween: 30     
      },

      // when window width is <= 640px     
      1200: {       
        slidesPerView: 2,        
     },
  
   } 
  });

  document.querySelector('.float__button').addEventListener('click', () => {
    document.querySelector('.hero__logo').scrollIntoView({
      behavior: 'smooth'
    });
  })






