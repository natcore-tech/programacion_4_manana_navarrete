import * as readlineSync from 'readline-sync';

function main(): void {
  let total=6
  let costo=0;
  let recaudado=0;
  let gigante=0;

  for (let i=1; i <=total; i++) {
    const nombre = readlineSync.question('Ingrese el nombre del perro: ')
    const peso = parseFloat(readlineSync.question('Ingrese el peso del perro: '))

    if (peso < 5) {
      costo=15;
      recaudado+=costo;
    } else if (peso <= 15) {
      costo=25
      recaudado+=costo;
    } else if (peso <= 30) {
      costo=40;
      recaudado+=costo;
    } else {
      costo=55;
      recaudado+=costo;
      gigante ++;
    }

    console.log(`
      El perro ${nombre} pesa ${peso}
      Costo del servicio $${costo}
    `)

  }

  console.log(`
    El total recaudado es de $${recaudado}
    La cantidad de perros gigantes es de ${gigante}
  `)
}

main();