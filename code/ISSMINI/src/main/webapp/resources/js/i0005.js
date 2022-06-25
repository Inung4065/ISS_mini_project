$( function(  ) {
    $( "#btnCreate" ).click( function(  ) {

        var textTitle=$( "#textTitleForCheck" ).val(  );
        var textContents=$( "#textContentsForCheck" ).val(  );

        if ( textTitle == "" ) {

            var msg = document.getElementById( "IME0004" ).value;
            alert( msg );
            $( "#textTitleForCheck" ).focus(  );
            $( 'form' ).bind( 'submit', false );

            return;
        }

        if ( textContents == "" ) {

            var msg = document.getElementById( "IME0004" ).value;
            alert( msg );
            $( "#textContentsForCheck" ).focus(  );
            $( 'form' ).bind( 'submit', false );

            return;
        }

        $( 'form' ).unbind(  );
    } );
} );