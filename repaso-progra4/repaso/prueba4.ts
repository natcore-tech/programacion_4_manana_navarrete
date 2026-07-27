import * as readlineSync from 'readline-sync';

function main(): void {
    let r = 4

    let ingreso = 0;

    for (let i=1; i <=r; i++) {
        let costo = 0;
        let repa: string;
        const nombre = readlineSync.question('Ingrese su nombre: ');
        const tipo = parseInt(readlineSync.question('Ingrese el tipo de servicio que desea (1-4): '))

        if (tipo === 1) {
            costo = 25;
            repa = 'Amplicacion de memoria ram';
            ingreso += costo;
        } else if (tipo === 2){
            costo = 35;
            repa = 'Reparacion de microelectronica';
            ingreso += costo;
        } else if (tipo === 3){
            costo = 50;
            repa = 'Mantenimiento Preventivo';
            ingreso += costo;
        } else if (tipo === 4){
            costo = 85;
            repa = 'Instalacion de ssd m.2';
            ingreso += costo;
        } else {
            costo = 0;
            repa = 'No definido';
        }

        console.log(` 
            Cliente: ${nombre}
            Tipo de intervencion (1-4): ${tipo}
            ${repa} ${costo} 
        
            `);
    }

    console.log(`Total ingreso: ${ingreso}`);
}

main();