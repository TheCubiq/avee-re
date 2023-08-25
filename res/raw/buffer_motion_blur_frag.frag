//http://dev.theomader.com/gaussian-kernel-calculator/

precision highp float;//on medium it gets poor texture cord sampling..
precision mediump int;
precision lowp sampler2D;
precision lowp samplerCube;

//"in" attributes from our vertex shader
varying vec4 vColor;
varying vec2 vTexCoord;

//declare uniforms
uniform sampler2D u_texture;

//uniform sampler2D u_texture2;

uniform vec2 posAmount;
uniform vec2 scaleAmount;

//uniform float maskadd;
//uniform float maskmul;

//uniform float tex2_y_add;
//uniform float tex2_y_mul;


void main() {

	///////////

	    //vec2 vTexCoordOffset = vec2(0.003, 0.003);

    	//vec4 color0 = texture2D(u_texture,vTexCoord+dirAmount);
    	//vec4 color1 = texture2D(u_texture,vTexCoord);
    	//vec4 color2 = texture2D(u_texture,vTexCoord-dirAmount);
    	//vec4 color2 = texture2D(u_texture2,vTexCoord);

    //color1.r = color0.r;
    //color1.g = 0.0;
    //color1.b = color2.b;

    vec4 sum = vec4(0.0, 0.0, 0.0, 0.0);



    //finalColor.r = (color0.r * splitColor0.r) + (color1.r * splitColor1.r) + (color2.r * splitColor2.r);
    //finalColor.g = (color0.g * splitColor0.g) + (color1.g * splitColor1.g) + (color2.g * splitColor2.g);
    //finalColor.b = (color0.b * splitColor0.b) + (color1.b * splitColor1.b) + (color2.b * splitColor2.b);
    //finalColor.a = (color0.a + color1.a + color2.a) * 0.33333333;

//float scaleMulX = abs(vTexCoord.x - vec2(0.5, 0.5));

        vec2 scaleMul = vec2((vTexCoord.x - 0.5) * 2.0, (vTexCoord.y - 0.5) * 2.0);

        //sum += texture2D(u_texture, vTexCoord + (-3.0*dirAmount)) * 0.0540540541;
        //sum += texture2D(u_texture, vTexCoord + (-2.0*dirAmount)) * 0.1216216216;
        //sum += texture2D(u_texture, vTexCoord + (-1.0*dirAmount)) * 0.1945945946;
        //sum += texture2D(u_texture, vTexCoord) * 0.2594594594;//0.2270270270;
        //sum += texture2D(u_texture, vTexCoord + (1.0*dirAmount)) * 0.1945945946;
        //sum += texture2D(u_texture, vTexCoord + (2.0*dirAmount)) * 0.1216216216;
        //sum += texture2D(u_texture, vTexCoord + (3.0*dirAmount)) * 0.0540540541;


vec2 dirAmount2;
 dirAmount2.x = posAmount.x + (abs(scaleAmount.x) * scaleMul.x); //its important that scaleAmount x/y are same sign
 dirAmount2.y = posAmount.y + (abs(scaleAmount.y) * scaleMul.y);
//dirAmount2 = (scaleAmount * scaleMul);


                //sum += texture2D(u_texture, vTexCoord + (-3.0*dirAmount2)) * 0.0540540541;
                //sum += texture2D(u_texture, vTexCoord + (-2.0*dirAmount2)) * 0.1216216216;
                //sum += texture2D(u_texture, vTexCoord + (-1.0*dirAmount2)) * 0.1945945946;
                //sum += texture2D(u_texture, vTexCoord) * 0.2594594594;//0.2270270270;
                //sum += texture2D(u_texture, vTexCoord + (1.0*dirAmount2)) * 0.1945945946;
                //sum += texture2D(u_texture, vTexCoord + (2.0*dirAmount2)) * 0.1216216216;
                //sum += texture2D(u_texture, vTexCoord + (3.0*dirAmount2)) * 0.0540540541;

                //sum += texture2D(u_texture, vTexCoord + (-4.0*dirAmount2)) * 0.028532;
                //sum += texture2D(u_texture, vTexCoord + (-3.0*dirAmount2)) * 	0.067234;
                //sum += texture2D(u_texture, vTexCoord + (-2.0*dirAmount2)) * 0.124009;
                //sum += texture2D(u_texture, vTexCoord + (-1.0*dirAmount2)) * 	0.179044;
                //sum += texture2D(u_texture, vTexCoord) * 	0.20236;
                //sum += texture2D(u_texture, vTexCoord + (1.0*dirAmount2)) * 	0.179044;
                //sum += texture2D(u_texture, vTexCoord + (2.0*dirAmount2)) * 0.124009;
                //sum += texture2D(u_texture, vTexCoord + (3.0*dirAmount2)) * 	0.067234;
                //sum += texture2D(u_texture, vTexCoord + (4.0*dirAmount2)) * 0.028532;


                //Sigma 3.0; Size 9
                                sum += texture2D(u_texture, vTexCoord + (-4.0*dirAmount2)) * 0.063327;
                                sum += texture2D(u_texture, vTexCoord + (-3.0*dirAmount2)) * 	0.093095;
                                sum += texture2D(u_texture, vTexCoord + (-2.0*dirAmount2)) * 0.122589;
                                sum += texture2D(u_texture, vTexCoord + (-1.0*dirAmount2)) * 	0.144599;
                                sum += texture2D(u_texture, vTexCoord) * 	0.152781;
                                sum += texture2D(u_texture, vTexCoord + (1.0*dirAmount2)) * 	0.144599;
                                sum += texture2D(u_texture, vTexCoord + (2.0*dirAmount2)) * 0.122589;
                                sum += texture2D(u_texture, vTexCoord + (3.0*dirAmount2)) * 	0.093095;
                                sum += texture2D(u_texture, vTexCoord + (4.0*dirAmount2)) * 0.063327;

                //Sigma 4.0; Size 9
                                //sum += texture2D(u_texture, vTexCoord + (-4.0*dirAmount2)) * 0.081812;
                                //sum += texture2D(u_texture, vTexCoord + (-3.0*dirAmount2)) * 	0.101701;
                                //sum += texture2D(u_texture, vTexCoord + (-2.0*dirAmount2)) * 0.118804;
                                //sum += texture2D(u_texture, vTexCoord + (-1.0*dirAmount2)) * 	0.130417;
                                //sum += texture2D(u_texture, vTexCoord) * 	0.134535;
                                //sum += texture2D(u_texture, vTexCoord + (1.0*dirAmount2)) * 	0.130417;
                                //sum += texture2D(u_texture, vTexCoord + (2.0*dirAmount2)) * 0.118804;
                                //sum += texture2D(u_texture, vTexCoord + (3.0*dirAmount2)) * 	0.101701;
                                //sum += texture2D(u_texture, vTexCoord + (4.0*dirAmount2)) * 0.081812;





    	gl_FragColor = sum;
    	//gl_FragColor = vec4(1.0, 0.0, 0.0 ,1.0);

    	//gl_FragColor = texture2D(u_texture, vTexCoord);
}