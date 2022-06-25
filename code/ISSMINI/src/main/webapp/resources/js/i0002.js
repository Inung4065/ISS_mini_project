function cancelBtn(  ) {

    var msg = document.getElementById( "imi0003" ).value;
    var result = confirm( msg );

    if ( result ) {

        location.href='/issmini'
    }
}