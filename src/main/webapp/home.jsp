
<%@page language="java" 
 contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html lang="pt-br">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="assets/bootstrap.min.css">
  <link rel="stylesheet" href="style.css">
  <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />

  <title>Hospedagem - Gulliver Traaveler</title>
  <script src="./geolocation.js"></script>
</head>

<body>
  <header class="header d-flex justify-content-md-end">

    <div class="header__lingua">
      <img class="w-50" src="./assets/br.svg" alt="">
    </div>

    <div class="header__acessibilidade">
      <ul class="header__acessibilidade__lista">
        <li><a href="" class="" aria-label="" tabindex="0">Contraste</a></li>
        <li><button type="button" class="btn btn-success"></button></li>
        <li><button type="button" class="btn btn-warning"></button></li>
        <li><button type="button" class="btn btn-info"></button></li>
        <li><a href="" class="" aria-label="" tabindex="0">A-</a></li>
        <li><a href="" class="" aria-label="" tabindex="0">A+</a></li>
        <li><a href="" class="" aria-label="" tabindex="0"><img src="./assets/brightness_6.svg" alt=""
              class="w-100"></a></li>
      </ul>
    </div>
  </header>

  <main role="main">

    <!-- HERO, MENU, LOG-IN, BARRA DE PESQUISA -->
    <div class="hero justify-content-around">\
      <div class="container">
        <div class="row">
          <div class="hero__hamburguer col d-md-none">
            <img class="w-50 pt-3" src="./assets/Vector1.svg" alt="">
          </div>
          <div class="hero__logo col-7 col-md-2">
            <img class="img-fluid" src="./assets/Group 150.svg" alt="">
            <!-- <h1>Gulliver <span>Traveller</span></h1> -->
          </div>
          <div class="hero__login col d-md-none ">
            <svg width="50" height="50" viewBox="0 0 50 50" fill="none" xmlns="http://www.w3.org/2000/svg">
              <path
                d="M24.9999 25C29.6041 25 33.3333 21.2709 33.3333 16.6667C33.3333 12.0625 29.6041 8.33337 24.9999 8.33337C20.3958 8.33337 16.6666 12.0625 16.6666 16.6667C16.6666 21.2709 20.3958 25 24.9999 25ZM24.9999 29.1667C19.4374 29.1667 8.33325 31.9584 8.33325 37.5V41.6667H41.6666V37.5C41.6666 31.9584 30.5624 29.1667 24.9999 29.1667Z"
                fill="white" />
            </svg>
          </div>



          <div class="col-12 col-md-10">

            <div class="col-md-12 d-flex justify-content-md-end p-0">
              <div class="d-none d-md-block botoes__md">
                <button class="btn btn__secondary">Cadastrar</button>
                <button class="btn btn__primary">Login</button>
              </div>
            </div>

            <div class="col-12 col-md-12 position-relative mt-lg-5 special-padding">
              <input class="form-control w-100 mt-5" type="text" placeholder="O que procura para sua viagem?">
              <span class="position-absolute icon__search-input"><svg width="16" height="15" viewBox="0 0 16 15"
                  fill="none" xmlns="http://www.w3.org/2000/svg">
                  <path
                    d="M11.0767 9.43396H10.3767L10.1286 9.2024C10.997 8.2247 11.5198 6.9554 11.5198 5.57461C11.5198 2.49571 8.94114 0 5.75991 0C2.57867 0 0 2.49571 0 5.57461C0 8.65352 2.57867 11.1492 5.75991 11.1492C7.18659 11.1492 8.49808 10.6432 9.50827 9.80274L9.74753 10.0429V10.7204L14.1782 15L15.4986 13.7221L11.0767 9.43396ZM5.75991 9.43396C3.55342 9.43396 1.77228 7.71012 1.77228 5.57461C1.77228 3.43911 3.55342 1.71527 5.75991 1.71527C7.96639 1.71527 9.74753 3.43911 9.74753 5.57461C9.74753 7.71012 7.96639 9.43396 5.75991 9.43396Z"
                    fill="black" />
                </svg>
              </span>

            </div>
          </div>
          <!-- MENU DETALHADO -->
          <div class="hero__menu d-none d-md-flex w-100">
     		<ul class="hero__menu__items">
              <li class=""> <a href="gastronomia">
                  <img src="./assets/restaurant.svg" alt=""> Gastronomia
                </a>
              </li>
              <li class=""> <a href="cultura">
                  <img src="./assets/Vector6.svg" alt=""> Cultura
                </a>
              </li>
              <li class=""> <a href="alugue-seu-carro">
                  <img src="./assets/directions_car.svg" alt=""> Aluguel de Carro
                </a>
              </li>
      			<li class=""> <a href="parceiro?id=1">
                  <img src="./assets/hotel1.svg" alt=""> Entretenimento
                </a>
              </li>
              <li class="hero__menu__items-active"> <a href="hospedagem">
                  <img src="./assets/hotel1.svg" alt=""> Hospedagem
                </a>
              </li>
              <li class=""> <a href="voos">
                  <img src="./assets/flight_takeoff.svg" alt=""> Vôos
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>



    <!-- ALERTA COVID -->
    <div class=" covid">
      <div class="container">
        <div class="row">
          <div class="col d-flex justify-content-center">
            <img src="./assets/info.svg" alt="">
          </div>
          <div class="col-8 d-flex justify-content-center">
            <p>
              Ajuda relacionada ao Coronavírus (COVID-19)
            </p>
          </div>
          <div class="col d-flex justify-content-center align-items-center">
            <svg width="18" height="11" viewBox="0 0 18 11" fill="none" xmlns="http://www.w3.org/2000/svg">
              <path
                d="M18 2.09312L15.885 -9.24496e-08L9 6.79892L2.115 -6.94355e-07L-9.14931e-08 2.09312L9 11L18 2.09312Z"
                fill="#004F32" />
            </svg>
          </div>
        </div>
      </div>
    </div>

    <!-- ANUNCIO E TITULO -->
    <div class="container">
      <div class="row d-flex flex-row flex-lg-row-reverse">
        <div class="col-12 col-lg-9 anuncio">
          <img class="img-fluid banner" src="assets/banner-motel.png" alt="Banner publicitário" aria>
        </div>
        <div class="col-sm-12 d-flex justify-content-start  justify-content-lg-center col-lg-3 categoria">
          <h2 class="border-bottom border-success">Bem vindo ao Guliver</h2>
        </div>
      </div>






      <div class="row">
        <div class="col-sm-12">
          <p class="texto">Encontre ofertas em hotéis, casas, apartamentos e muito mais...</p>
          <span>De hotéis-fazenda aconchegantes a apartamentos modernos na cidade</span>
        </div>
      </div>

      <div class="row form">
        <div class="col-sm-12">

          <div class="filter__wrapper">
            <div class="filter__inputs">
              <div><input class="w-100 filter__inputs_where " type="text" placeholder="Para onde voce vai?"></div>
              <div class="flex">
                <input class="w-50 filter__inputs_calendar unstyled" type="datetime-local">
                <select name="" id="" class="w-50 filter__inputs_person form-select" aria-label="Quantidade de adultos">
                  <option value="1" selected>1 adulto</option>
                  <option value="2"> 2 adultos </option>
                  <option value="3"> 3 adultos </option>
                  <option value="4"> 4 adultos </option>
                  <option value="5"> 5 adultos </option>
                  <option value="6"> 6 adultos </option>
                </select>

              </div>
            </div>
            <div class="filter__button">
              <button>
                <img src="assets/search.svg" />
              </button>
            </div>
          </div>


        </div>
      </div>

      <!-- CHECKBOX -->

      <div class="row">
        <div class="col-sm-12">
          <div class="tipo-viagem">
            <div class="tipo-viagem__trabalho form-check">
              <input class="form-check-input" type="checkbox" id="trabalho" name="trabalho" value="">
              <label class="form-check-label" for="trabalho">Vou viajar a trabalho</label>
            </div>
            <div class="tipo-viagem__negocios form-check">
              <input class="form-check-input" type="checkbox" id="negocios" name="negocios" value="">
              <label class="form-check-label" for="negocios">Vou viajar a negócios</label>
            </div>
            <div class="tipo-viagem__turixso form-check">
              <input class="form-check-input" type="checkbox" id="turixso" name="turixso" value="">
              <label class="form-check-label" for="turixso">Vou viajar a turixso</label>
            </div>
          </div>
        </div>
      </div>
      <hr>
      
  </main>

  <footer class="rodape">
    <div class="container">
      <button class="float__button">></button>

      <div class="rodape__redessociais">
        <ul>
          <li><a href=""> <img src="./assets/Facebook Circled.svg" alt=""></a></li>
          <li><a href=""> <img src="./assets/Vector3.svg" alt=""></a></li>
          <li><a href=""> <img src="./assets/Vector4.svg" alt=""></a></li>
          <li><a href=""> <img src="./assets/TripAdvisor.svg" alt=""></a></li>
        </ul>
      </div>
      <div class="rodape__link">
        <ul>
          <li><a href="">Minha Conta</a></li>
          <li><a href="">Seja um Traveller</a></li>
          <li><a href="">Contato</a></li>
          <li><a href="">Mapa do site</a></li>
        </ul>
      </div>
      <div class="rodape__direitos">
        <p>© 2021 Gulliver Traveller - Todos os direitos reservados.</p>
      </div>
    </div>
  </footer>

  <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
  <script src="script.js"></script>
</body>

</html>