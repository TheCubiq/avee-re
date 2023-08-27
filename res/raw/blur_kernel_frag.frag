
precision mediump float;
precision mediump int;
precision lowp sampler2D;
precision lowp samplerCube;

//"in" attributes from our vertex shader
varying vec4 vColor;
varying vec2 vTexCoord;

//declare uniforms
uniform sampler2D u_texture;
//uniform sampler2D uTexRandom;

//light shader
    uniform sampler2D u_texture2;
    //uniform float maskadd;
    //uniform float maskmul;
    //uniform float mask_l_add;
    //uniform float mask_l_mul;
    //
    //uniform float tex2_y_add;
    //uniform float tex2_y_mul;
//

uniform float resolutionW;
uniform float resolutionH;
uniform float radius;//the amount to blur, in pixels
uniform vec4 Color2;


//const int uSampleKernelSize = 17;
//uniform vec3 uSampleKernel[17];
//float a[5] = float[5](3.4, 4.2, 5.0, 5.2, 1.1);
//uniform vec3 uSampleKernel[5];
 //= {
  //          vec3(0.0, 0.0, 0.2270270270),
  //          vec3(1.0, 1.0, 0.1945945946),
   //         vec3(2.0, 2.0, 0.1216216216),
   //         vec3(3.0, 3.0, 0.0540540541),
   //         vec3(4.0, 4.0, 0.0162162162)};


//float rand(vec2 n)
//{
//  return 0.5 + 0.5 *
//     fract(sin(dot(n.xy, vec2(12.9898, 78.233)))* 43758.5453);
//}

void main() {


//vec3 uSampleKernel[17];
  // uSampleKernel[0] =  vec3(0.0, 0.0, 0.2270270270);
  // uSampleKernel[1] =  vec3(1.0, 1.0, 0.1945945946);
  // uSampleKernel[2] =  vec3(2.0, 2.0, 0.1216216216);
  // uSampleKernel[3] =  vec3(3.0, 3.0, 0.0540540541);
   //uSampleKernel[4] =  vec3(4.0, 4.0, 0.0162162162);

     // uSampleKernel[5] =  vec3(-1.0, -1.0, 0.1945945946);
    // uSampleKernel[6] =  vec3(-2.0, -2.0, 0.1216216216);
    // uSampleKernel[7] =  vec3(-3.0, -3.0, 0.0540540541);
    //  uSampleKernel[8] =  vec3(-4.0, -4.0, 0.0162162162);

     // uSampleKernel[9] =  vec3(1.0, -1.0, 0.1945945946);
     // uSampleKernel[10] =  vec3(2.0, -2.0, 0.1216216216);
    // uSampleKernel[11] =  vec3(3.0, -3.0, 0.0540540541);
     // uSampleKernel[12] =  vec3(4.0, -4.0, 0.0162162162);

        //    uSampleKernel[13] =  vec3(-1.0, 1.0, 0.1945945946);
        //    uSampleKernel[14] =  vec3(-2.0, 2.0, 0.1216216216);
        //   uSampleKernel[15] =  vec3(-3.0, 3.0, 0.0540540541);
         //   uSampleKernel[16] =  vec3(-4.0, 4.0, 0.0162162162);

	vec4 sum = vec4(0.0);

	//vec2 tc = vTexCoord;

	vec2 blur = vec2(radius/resolutionW, radius/resolutionH);
    vec2 co = vec2(vTexCoord.x*resolutionW, vTexCoord.y*resolutionH);

//vec2 co = vec2(vTexCoord.x, vTexCoord.y);
        //float a = 12.9898;
        //float b = 78.233;
        //float c = 43758.5453;
        //float dt= dot(co.xy ,vec2(a,b));
        //float sn= mod(dt,3.14);
    //float random = fract(sin(sn) * c);

//float a = co.x*2.0;
//float b = 1.0;
//float random = a - (b * floor(a/b));
//float random = mod(co.x*4753.0,1.0);

float random = co.x + co.y;

//float sn= mod(dot(co.xy,vec2(12.9898,78.233)),3.14);
    //float random = fract(sin(sn) * 43758.5453);
	//float vstep = (vTexCoord.x*resolutionW) + (vTexCoord.y*resolutionH * 2.0f);


	float Pi2p = 6.28318530718 / 10.0;

		float r = Pi2p * random;// * 10.0;//mod(vstep, 10.0);

 vec2 dir;// = vec2(0.0, 0.0);


                    dir.x = cos(r); dir.y = sin(r); r=r+Pi2p;
                sum += texture2D(u_texture, vTexCoord + (0.0*dir*blur)) * 0.132572;
                    dir.x = cos(r); dir.y = sin(r); r=r+Pi2p;
                sum += texture2D(u_texture, vTexCoord + (1.0*dir*blur)) * 0.125472;
                    dir.x = cos(r); dir.y = sin(r); r=r+Pi2p;
                sum += texture2D(u_texture, vTexCoord + (2.0*dir*blur)) * 0.106373;
                    dir.x = cos(r); dir.y = sin(r); r=r+Pi2p;
                sum += texture2D(u_texture, vTexCoord + (3.0*dir*blur)) * 0.08078;
                    dir.x = cos(r); dir.y = sin(r); r=r+Pi2p;
                sum += texture2D(u_texture, vTexCoord + (4.0*dir*blur)) * 0.05495;
                    dir.x = cos(r); dir.y = sin(r); r=r+Pi2p;
                sum += texture2D(u_texture, vTexCoord + (5.0*dir*blur)) * 0.033482;
                    dir.x = cos(r); dir.y = sin(r); r=r+Pi2p;
                sum += texture2D(u_texture, vTexCoord + (6.0*dir*blur)) * 0.018275;
                    dir.x = cos(r); dir.y = sin(r); r=r+Pi2p;
                sum += texture2D(u_texture, vTexCoord + (7.0*dir*blur)) * 0.008934;
                    dir.x = cos(r); dir.y = sin(r); r=r+Pi2p;
                sum += texture2D(u_texture, vTexCoord + (8.0*dir*blur)) * 0.003912;
                    dir.x = cos(r); dir.y = sin(r); r=r+Pi2p;
                sum += texture2D(u_texture, vTexCoord + (9.0*dir*blur)) * 0.001535;


    	//gl_FragColor = texture2D(u_texture, vTexCoord);
    	gl_FragColor = sum * 1.7658859;
//gl_FragColor = vec4( vec3( random ), 1.0 );














	    //vec3 normal = vec3(0.0, 0.0, 1.0);
        //vec3 rvec = texture2D(uTexRandom, vec2( vTexCoord.x*((resolutionW * 4.0)/ 16.0) , vTexCoord.y*((resolutionH* 4.0)/ 16.0))).xyz * 2.0 - 1.0;

        //    //vec3 rvec = vec3(1.0, 0.0 ,0.0);
        //    //vec3 rvec = vec3(rand(vTexCoord), rand(vTexCoord), 0.0);
        //vec3 tangent = normalize(rvec - normal * dot(rvec, normal));
        //vec3 bitangent = cross(normal, tangent);
        //mat3 tbn = mat3(tangent, bitangent, normal);

	    //    //gl_FragColor = vec4(rvec, 1.0);
        //float w;
        //vec3 offset;
        //for (int i = 0; i < uSampleKernelSize; ++i) {
        //offset = uSampleKernel[i];
        //w = offset.z;
        //offset = tbn * vec3(offset.xy, 0.0);
        //sum += texture2D(u_texture, vec2(tc.x + offset.x*blurW, tc.y + offset.y*blurH)) * w;
        //}
        // gl_FragColor = sum;
}