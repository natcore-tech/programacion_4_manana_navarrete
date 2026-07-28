import * as readLineSync from 'readline-sync';

function main(): void {
    const TOTAL = 6;

    let totalInventario = 0;
    let lujo = 0;

    for(let i =1; i <= TOTAL; i++) {
        const modelo = readLineSync.question(`Vehiculo ${i} - Modelo: `);
        const precio = parseFloat(readLineSync.question(`Vehiculo ${i} - Precio: `));

        let segmento: string;

        if (precio < 15000) {
            segmento = 'Economico';
        } else if (precio <= 30000) {
            segmento = 'Medio';
        } else if (precio <= 60000) {
            segmento = 'Premium';
        } else {
            segmento = 'Lujo';
            lujo++;
        }

        totalInventario += precio;
        console.log(`[${modelo}] $${precio.toFixed(2)} -> Segmento ${segmento}\n`)
    }

    console.log(`Valor total del inventario: $${totalInventario.toFixed(2)}`);
    console.log(`Vehiculos segmento lujo : ${lujo} de ${TOTAL}`);
    

}

main();