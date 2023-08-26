
precision mediump float;
precision mediump int;
precision lowp sampler2D;
precision lowp samplerCube;

//"in" attributes from our vertex shader
varying vec4 vColor;
varying vec2 vTexCoord;

//declare uniforms
uniform sampler2D u_texture;
uniform float blurH;
uniform vec4 Color2;
uniform vec2 resolution;

void main() {
	vec4 sum = vec4(0.0);

//vI
    ////apply blurring, using a 9-tap filter with predefined gaussian weights
	////sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y - 4.0*blurH)) * 0.0162162162;
	//sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y - 3.0*blurH)) * 0.0540540541;
	//sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y - 2.0*blurH)) * 0.1216216216;
	//sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y - 1.0*blurH)) * 0.1945945946;

	//sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y)) * 0.2270270270;

	//sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y + 1.0*blurH)) * 0.1945945946;
	//sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y + 2.0*blurH)) * 0.1216216216;
	//sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y + 3.0*blurH)) * 0.0540540541;
	////sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y + 4.0*blurH)) * 0.0162162162;

	//vII
	    vec2 dirAmount2 = vec2(0.0, blurH);
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
    gl_FragColor = vec4(((Color2.rgb) + (sum.rgb*sum.a))*sum.a, sum.a);

    //gl_FragColor = vec4((Color2.rgb*sum.a + sum.rgb)*sum.a, sum.a);


    ////vIII
    //vec2 direction = vec2(0.0, blurH);
    ////vec2 resolution = vec2(resolutionH,1.0);
    //vec2 uv = vTexCoord;

    //  vec4 color = vec4(0.0);
    //  vec2 off1 = vec2(1.411764705882353) * direction;
    //  vec2 off2 = vec2(3.2941176470588234) * direction;
    //  vec2 off3 = vec2(5.176470588235294) * direction;
    //  color += texture2D(u_texture, uv) * 0.1964825501511404;
    //  color += texture2D(u_texture, uv + (off1 / resolution)) * 0.2969069646728344;
    //  color += texture2D(u_texture, uv - (off1 / resolution)) * 0.2969069646728344;
    //  color += texture2D(u_texture, uv + (off2 / resolution)) * 0.09447039785044732;
    //  color += texture2D(u_texture, uv - (off2 / resolution)) * 0.09447039785044732;
    //  color += texture2D(u_texture, uv + (off3 / resolution)) * 0.010381362401148057;
    // color += texture2D(u_texture, uv - (off3 / resolution)) * 0.010381362401148057;
    //    gl_FragColor = color;
}