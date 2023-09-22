.class public Lcom/daaw/avee/comp/Visualizer/Elements/Box3DElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "Box3DElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "3DBox"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;-><init>()V
    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Box3DElement;->typeName:Ljava/lang/String;

    return-object v0
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    .line 41
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method

.method public isShaderEditable()Z
    .locals 1

    const v0, 0x0

    return v0
.end method

.method public initCustomShader()V

    .locals 5

    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;
    move-result-object v2
    invoke-virtual {v2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;
    move-result-object v2
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    move-result-object v2


    # load the default shadervert
    const v3, 0x7f0f0034
    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;


    new-instance v3, Ljava/lang/StringBuilder;
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    # boilerplate
    # const-string v4, "precision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\n"
    # invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    # shaderFrag:
    const-string v4, "// Cubiq - 3d\nprecision highp float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\n#define texture texture2D\n#define iResolution vec2(640., 480.)\n\n#define fragColor gl_FragColor\n#define fragCoord gl_FragCoord.xy\n\n\n\n//'in' attributes from our vertex shader\n//varying vec4 vColor;\nvarying vec2 vTexCoord;\n\n//declare uniforms\nuniform sampler2D u_texture;\n\n#define iChannel0 u_texture \n\nuniform float u_cubeRotX;     \nuniform float u_cubeRotY;     \nuniform float u_cubeRotZ;     \nuniform float u_controlCubeRot;\nuniform float u_cubeTransX;   \nuniform float u_cubeTransY;   \nuniform float u_cubeTransZ;   \nuniform float u_scaleX;       \nuniform float u_scaleY;       \nuniform float u_scaleZ;       \nuniform float u_camRotX;      \nuniform float u_camRotY;      \nuniform float u_camRotZ;      \nuniform float u_controlCamRot;\nuniform float u_aspectRatio;  \n\nuniform float u_cubeTextureScale;   \nuniform float u_cameraDistance; \nuniform float u_cameraPosX;     \nuniform float u_cameraPosY;     \nuniform float u_cameraPosZ;     \nuniform float u_cameraTargetX;  \nuniform float u_cameraTargetY;  \nuniform float u_cameraTargetZ;  \nuniform float u_cameraFov;      \n\nuniform float u_splitTextures;      \nuniform float u_textureAspect; // textureAspect     \nuniform float u_planeTextureScale;      \nuniform float u_value4;      \nuniform float u_value5;      \n\nuniform float u_postFX;\nuniform float u_shadow;\nuniform float u_showPlane;\nuniform float u_showCube;\nuniform float u_planeInfinite;\n\n#define SPLIT_TEXTURE floatToBool(u_splitTextures)\n\n#define POSTFX floatToBool(u_postFX)\n#define SHADOW floatToBool(u_shadow)\n\n#define PLANE floatToBool(u_showPlane)\n#define LIMIT_PLANE floatToBool(u_planeInfinite)\n\n#define CUBE floatToBool(u_showCube)\n\n#define ENV !true\n\n\n// Ray-Box intersection, by convertig the ray to the local space of the box.\n//\n// If this was used to raytace many equally oriented boxes (say you are traversing\n// a BVH), then the transformations in line 34 and 35 could be skipped, as well as\n// the normal computation in line 50. One over the ray direction is usually accessible\n// as well in raytracers, so the division would go away in real world applications.\n\n\n// List of ray-surface intersectors at https://www.shadertoy.com/playlist/l3dXRf\n//\n// and https://iquilezles.org/articles/intersectors\n\n\n// Other Box functions (https://iquilezles.org/articles/boxfunctions)\n//\n// Intersection:     https://www.shadertoy.com/view/ld23DV\n// Occlusion:        https://www.shadertoy.com/view/4sSXDV\n// Occlusion:        https://www.shadertoy.com/view/4djXDy\n// Density:          https://www.shadertoy.com/view/Ml3GR8\n// Fake soft shadow: https://www.shadertoy.com/view/WslGz4\n// Gradient:         https://www.shadertoy.com/view/wlcXD2\n\n\nbool floatToBool(float f) { return f > 0.5; }\n\n// https://iquilezles.org/articles/boxfunctions\nvec4 iBox( in vec3 ro, in vec3 rd, in mat4 txx, in mat4 txi, in vec3 rad ) \n{\n    // convert from ray to box space\n	vec3 rdd = (txx*vec4(rd,0.0)).xyz;\n	vec3 roo = (txx*vec4(ro,1.0)).xyz;\n\n	// ray-box intersection in box space\n    vec3 m = 1.0/rdd;\n    #if 1\n    vec3 n = m*roo;\n    vec3 k = abs(m)*rad;\n    vec3 t1 = -n - k;\n    vec3 t2 = -n + k;\n	#else\n    // more robust\n    vec3 k = vec3(rdd.x>=0.0?rad.x:-rad.x, rdd.y>=0.0?rad.y:-rad.y, rdd.z>=0.0?rad.z:-rad.z);\n    vec3 t1 = (-roo - k)*m;\n    vec3 t2 = (-roo + k)*m;\n    #endif\n    float tN = max(max(t1.x,t1.y),t1.z);\n    float tF = min(min(t2.x,t2.y),t2.z);\n    \n    // no intersection\n	if( tN>tF || tF<0.0 ) return vec4(-1.0);\n\n    #if 1\n    // this works as long as the ray origin is not inside the box\n    vec4 res = vec4(tN, step(tN,t1) );\n    #else\n    // use this instead if your rays origin can be inside the box\n    vec4 res = (tN>0.0) ? vec4( tN, step(vec3(tN),t1)) :\n                          vec4( tF, step(t2,vec3(tF)));\n    #endif\n    \n    // add sign to normal and convert to ray space\n	res.yzw = (txi * vec4(-sign(rdd)*res.yzw,0.0)).xyz;\n\n	return res;\n}\n\n\n// https://iquilezles.org/articles/boxfunctions\nfloat sBox( in vec3 ro, in vec3 rd, in mat4 txx, in vec3 rad ) \n{\n	vec3 rdd = (txx*vec4(rd,0.0)).xyz;\n	vec3 roo = (txx*vec4(ro,1.0)).xyz;\n\n    vec3 m = 1.0/rdd;\n    vec3 n = m*roo;\n    vec3 k = abs(m)*rad;\n	\n    vec3 t1 = -n - k;\n    vec3 t2 = -n + k;\n\n	float tN = max( max( t1.x, t1.y ), t1.z );\n	float tF = min( min( t2.x, t2.y ), t2.z );\n	if( tN > tF || tF < 0.0) return -1.0;\n	\n	return tN;\n}\n\n\n//-----------------------------------------------------------------------------------------\n\nmat4 rotationAxisAngle( vec3 v, float angle )\n{\n    float s = sin( angle );\n    float c = cos( angle );\n    float ic = 1.0 - c;\n\n    return mat4( v.x*v.x*ic + c,     v.y*v.x*ic - s*v.z, v.z*v.x*ic + s*v.y, 0.0,\n                 v.x*v.y*ic + s*v.z, v.y*v.y*ic + c,     v.z*v.y*ic - s*v.x, 0.0,\n                 v.x*v.z*ic - s*v.y, v.y*v.z*ic + s*v.x, v.z*v.z*ic + c,     0.0,\n			     0.0,                0.0,                0.0,                1.0 );\n}\n\nmat4 translate( float x, float y, float z )\n{\n    return mat4( 1.0, 0.0, 0.0, 0.0,\n				 0.0, 1.0, 0.0, 0.0,\n				 0.0, 0.0, 1.0, 0.0,\n				 x,   y,   z,   1.0 );\n}\n\nmat4 translate( vec3 v )\n{\n    return translate( v.x, v.y, v.z );\n}\n \nmat4 inverse( in mat4 m )\n{\n	return mat4(\n        m[0][0], m[1][0], m[2][0], 0.0,\n        m[0][1], m[1][1], m[2][1], 0.0,\n        m[0][2], m[1][2], m[2][2], 0.0,\n        -dot(m[0].xyz,m[3].xyz),\n        -dot(m[1].xyz,m[3].xyz), \n        -dot(m[2].xyz,m[3].xyz),\n        1.0 );\n}//*/\n\nvoid main()\n{\n	vec2 p = vTexCoord * 2.0 - 1.0;\n    p.x *= u_aspectRatio;\n\n     // camera movement	\n	float an = 0.4*u_controlCamRot;\n	vec3 ro = vec3(\n        (u_cameraPosX+u_cameraDistance*cos(an*u_camRotX+0.001)), \n        (u_cameraPosY+u_cameraDistance*(sin(an*u_camRotY)+1.)/2.), \n        (u_cameraPosZ+u_cameraDistance*sin(an*u_camRotZ))\n    ) * 10.; // cam pos xyz\n    vec3 ta = vec3( u_cameraTargetX, u_cameraTargetY, u_cameraTargetZ ) * 5.;\n    // camera matrix\n    vec3 ww = normalize( ta - ro );\n    vec3 uu = normalize( cross(ww,vec3(0.0,1.0,0.0) ) );\n    vec3 vv = normalize( cross(uu,ww));\n	// create view ray\n	vec3 rd = normalize( p.x*uu + p.y*vv + u_cameraFov*10.*ww );\n\n    // rotate and translate box	\n	mat4 rot = rotationAxisAngle( normalize(vec3(u_cubeRotX,u_cubeRotY,u_cubeRotZ)), u_controlCubeRot );\n	\n    mat4 tra = translate( vec3(u_cubeTransX, u_cubeTransY, u_cubeTransZ) * 5. );\n    vec3 box = vec3(u_scaleX,u_scaleY,u_scaleZ);\n    \n	mat4 txi = tra * rot; \n	mat4 txx = inverse( txi );\n\n    // raytrace\n	float tmin = 100000.0;\n	vec3  nor = vec3(0.0);\n	vec3  pos = vec3(0.0);\n	\n	// raytrace-plane\n	float oid = 0.0;\n	\n    if (PLANE) {\n    ///*\n    \n    float h = (-0.0-ro.y)/rd.y;\n	if( h>0.0 ) \n	{ \n		tmin = h; \n		nor = vec3(0.0,1.0,0.0); \n		oid = 1.0;\n	}\n    }\n    \n    //*/\n\n	// raytrace box\n    \n    \n	vec4 res = iBox( ro, rd, txx, txi, box);\n	\n    if (CUBE) {\n    \n    if( res.x>0.0 && res.x<tmin )\n	{\n		tmin = res.x; \n		nor = res.yzw;\n		oid = 2.0;\n	}\n    \n    }\n\n    // shading/lighting	\n	vec4 col;\n    if (ENV) col.xyz = vec3(0.6,0.75,0.85) - 0.97*rd.y;\n    \n	if( tmin<100.0 )\n	{\n		pos = ro + tmin*rd;\n		\n        // material\n		float occ = 1.0;\n		vec4  mate = vec4(1.0);\n\n        vec2 aspect = vec2(u_textureAspect, 1.);\n\n        float cts = u_cubeTextureScale;\n        float pts = u_planeTextureScale;\n\n        float displacement = 0.0;\n\n        float splits = 1.;\n\n        if (SPLIT_TEXTURE) {\n                cts = 0.5;\n                pts = 0.5;\n                aspect = vec2(1., 1.);\n                displacement = 0.25; // 0.25\n                splits = 0.5;\n        }\n\n        vec2 disX = vec2(1., 1.) * displacement + 0.5;\n        vec2 disY = vec2(1.,-1.) * displacement + 0.5;\n        vec2 disZ = vec2(-1.,1.) * displacement + 0.5;\n\n        vec2 s = aspect*cts;\n\n		if( oid<1.5 ) // plane\n		{\n		    // vec2 myuv = vec2(-u_value2,-u_value2)+0.5+0.25*pos.xz*u_textureScale;\n		    vec2 myuv = 0.5+0.25*pos.xz*aspect*pts;\n            \n            mate = vec4(vec3(0.35),1.)*texture2D( iChannel0, mod(myuv*splits, vec2(splits) ));\n            \n            \n            if (\n                !LIMIT_PLANE && \n                (myuv.x >= 1. || myuv.x <= 0. || myuv.y >= 1. || myuv.y <= 0.)\n            ) mate = vec4(0.);\n            \n            \n			occ = 0.2 + 0.8*smoothstep( 0.0, 1.5, length(pos.xz) );\n		}\n		else // box\n		{\n            // recover box space data (we want to do shading in object space)			\n		    vec3 opos = (txx*vec4(pos,1.0)).xyz;\n			vec3 onor = (txx*vec4(nor,0.0)).xyz;\n\n            \n\n		    mate = abs(onor.x)*texture2D( iChannel0, disX+s*opos.yz ) + \n                   abs(onor.y)*texture2D( iChannel0, disY+s*opos.xz ) + \n                   abs(onor.z)*texture2D( iChannel0, disZ+s*opos.xy );\n			mate.xyz *= 0.35;\n            occ = 0.6 + 0.4*nor.y;\n		}		\n		\n        col = mate;\n        \n        if (POSTFX) {\n        \n        ///*\n        \n        // lighting\n        vec3  lig = normalize(vec3(0.8,0.4,-0.6));\n        float dif = clamp( dot(nor,lig), 0.0, 1.0 );\n        vec3  hal = normalize(lig-rd);\n        float sha = 1.0;\n        if (SHADOW) sha = step( iBox( pos+0.001*nor, lig, txx, txi, box ).x, 0.0 );\n        float amb = 0.6 + 0.4*nor.y;\n        float bou = clamp(0.3-0.7*nor.y,0.0,1.0);\n        float spe = clamp(dot(nor,hal),0.0,1.0);\n        \n        \n        col.xyz  = 4.0*vec3(1.00,0.80,0.60)*dif;\n        if (SHADOW) col.xyz *= sha;\n        col.xyz += 2.0*vec3(0.20,0.30,0.40)*amb;\n        col.xyz += 2.0*vec3(0.30,0.20,0.10)*bou;\n        col *= mate;            \n        col.xyz += 0.3*pow(spe,8.0)*dif*sha*(0.04+0.96*pow(clamp(dot(lig,hal),0.0,1.0),5.0));\n        //col = mix( col, vec3(0.6,0.7,0.8), 1.0-exp(-0.001*tmin*tmin) ); //fog\n        \n        //*/\n        \n        }\n        \n	}\n	\n    // vignetting        \n    col.xyz *= 1.0 - 0.1*dot(p,p);\n\n    // gamma\n    col.xyz = pow( col.xyz, vec3(0.45) );\n    \n	// grading\n    col.xyz = clamp(col.xyz,0.0,1.0);\n    col.xyz = col.xyz*col.xyz*(3.0-2.0*col.xyz);\n    \n    //col.xyz = post;\n\n	fragColor = vec4(col);\n}\n\n\n// The MIT License\n// Copyright © 2014 Inigo Quilez\n// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the 'Software'), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE."
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    return-void
.end method

.method public initCustomValues()V

    .locals 11

    # v2 : Default 
    # v3 : Min
    # v4 : Max

    # hex floats: 

    # 1.0f
    # 0x3f800000 
    # 0.5f
    # 0x3f000000 
    # 2.0f
    # 0x40000000 
    

    # addValueWithProperties("value1", 0.0f, -1.0f, 1.0f);
    move-object v0, p0


    const-string v5, "enviroment"


    # todo: checkboxes

    
    const/4 v2, 0x0 # default : 0.0f
    const/4 v3, 0x0 # min : 0.0f
    const/high16 v4, 0x3f800000 # max : 1.0f

    const-string v1, "postFX"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V


    # D 1.0f
    const v2, 0x3f800000 

    const-string v1, "shadow"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V

    const-string v1, "showCube"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
    
    const-string v1, "showPlane"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
    

    # D 0.0f
    const/4 v2, 0x0 

    const-string v1, "planeInfinite"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "splitTextures"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V




    const/4      v3, 0x0        # min : 0.0f
    const/high16 v4, 0x40000000 # max : 2.0f
    const/high16 v2, 0x3f800000 # def : 0.5f

    const-string v1, "cubeTextureScale" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "planeTextureScale" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "textureAspect"
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const/high16 v2, 0x3f000000 # default : 0.5f
    const-string v1, "aspectRatio" # 0.5/0/2
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        


    const/4 v2, 0x0 # default : 0.0f
    const/high16 v3, 0xbf800000    # -1.0f
    const/high16 v4, 0x3f800000 # max : 1.0f

    const-string v5, "1_Cube"
    
    #0/-1/1

    const-string v1, "controlCubeRot" # ideally add custom measuredef in the future
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "cubeRotX"
    # D 1.0f
    const/high16 v2, 0x3f800000 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V

    const-string v1, "cubeRotY" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
    
    const-string v1, "cubeRotZ" 
    # D 0.0f
    const/4 v2, 0x0 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "cubeTransX" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
    
    const-string v1, "cubeTransY" 
    # D 0.5f
    const/high16 v2, 0x3f000000
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "cubeTransZ" 
    # D 0.0f
    const/4 v2, 0x0 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
    

    # D 0.5f
    const/high16 v2, 0x3f000000

    const-string v1, "scaleX" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "scaleY" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "scaleZ" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V



    const-string v5, "5_Camera"

    const-string v1, "controlCamRot" 
    # D 0.0f
    const/4 v2, 0x0 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V


    # D 1.0f
    const/high16 v2, 0x3f800000
    const-string v1, "camRotX" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "camRotY" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "camRotZ" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V

    const-string v1, "cameraDistance" 
    # D 0.5f
    const/high16 v2, 0x3f000000
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "cameraPosX" 
    # D 0.0f
    const/4 v2, 0x0 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "cameraPosY" 
    # D 0.1f
    const v2, 0x3dcccccd
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "cameraPosZ" 
    # D 0.0f
    const/4 v2, 0x0 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "cameraTargetX" 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "cameraTargetY" 
    # D 0.5f
    const/high16 v2, 0x3f000000
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
    
    const-string v1, "cameraTargetZ" 
    # D 0.0f
    const/4 v2, 0x0 
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    const-string v1, "cameraFov" 
    # D 0.2f
    const v2, 0x3e4ccccd
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        


    # const-string v5, "Misc"
        
    # const-string v1, "value2" 
    # invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
        
    # const-string v1, "value4" 
    # invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
        
    # const-string v1, "value5" 
    # invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithPropertiesCat(Ljava/lang/String;FFFLjava/lang/String;)V
        
    return-void
.end method
