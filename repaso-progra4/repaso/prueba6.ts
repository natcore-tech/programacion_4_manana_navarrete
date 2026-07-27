import * as readlineSync from 'readline-sync';

function main(): void{
  let total=4;
  let recaudado=0;

  for(let i=1; i <= total; i++) {
    let descuento=0;
    let destino: string;
    let totalrecaudado=0;
    let precio=0;
    const opcion = parseInt(readlineSync.question('Seleccione el destino (1-4): '))
    const personas = parseInt(readlineSync.question('Seleccione el numero de personas: '))


    switch (opcion){
      case 1:
        destino='City Tour';
        precio=20;
        descuento=0;
        break
      case 2:
        destino='Montana';
        precio=45;
        descuento= precio*0.08;
        break
      case 3:
        destino='Playa';
        precio=60;
        descuento= precio*0.12;
        break
      case 4:
        destino='Safari';
        precio=110;
        descuento= precio*0.20;
        break
      default:
        destino='';
        precio=0;
        descuento=0;
        break
    }

    if (personas < 4) descuento=0;

    recaudado=personas*precio;

    totalrecaudado=recaudado-descuento;

    console.log(`
      El subtotal es de ${recaudado}
      El descuento es de ${descuento}
      El total es de ${totalrecaudado}
      El destino es ${destino}
      El numero de personas es ${personas}
    `)

  }


}
main();