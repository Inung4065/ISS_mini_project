$( function(  ) {
    $( "#btnSubmit" ).click( function(  ) {

        var accountId=$( "#accountIdForCheck" ).val(  );
        var accountPassword=$( "#accountPasswordForCheck" ).val(  );

        if ( accountId == "" ) {

            alert( "아이디를입력하세요" );
            $( "#accountIdForCheck" ).focus(  );
            $( 'form' ).bind( 'submit', false );

            return;
        }

        if ( accountPassword == "" ) {

            alert( "비밀번호를입력하세요" );
            $( "#accountPasswordForCheck" ).focus(  );
            $( 'form' ).bind( 'submit', false );

            return;
        }

        $( 'form' ).unbind(  );
    } );
} );