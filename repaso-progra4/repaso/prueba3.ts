import * as readlineSync from 'readline-sync';

function tarifaPorCategoria(cat: number): number {
    if (cat === 1) return 45.0;
    else if (cat === 2) return 75.0;
    else if (cat === 3) return 130.0;
    else if (cat === 4) return 220.0;
    else return 0.0;
}

function main(): void {
    let totalRecaudado = 0;
    let altoValor = 0;
    let totalReservas = 0;

    console.log('Para finalizar ingrese el 0')

    let noches = parseInt(readlineSync.question(`Reserva ${totalReservas + 1} Noches: `),10);

    while (noches !== 0 ) {
        const cat = parseInt(readlineSync.question('Categoria habitacion (1-4): '))
        const tarifa = tarifaPorCategoria(cat);

        const total = tarifa * noches;

        totalReservas++;
        totalRecaudado += total;

        if (total > 300) altoValor++;

        console.log(`Tarifa/noche: $${tarifa.toFixed(2)} | Total: $${total.toFixed(2)}`)

        noches = parseInt(readlineSync.question(`Reserva ${totalReservas + 1} Noches: `))
    }

    const estado = totalRecaudado >3000 ? 'Ocupacion alta' : 'Ocupacion Normal';

    console.log(`Total reservas atendidas: $${totalReservas}`)
    console.log(`Total recaudado: $${totalRecaudado}`)
    console.log(`Reservas de alto valor: ${altoValor}`)
}

main();
