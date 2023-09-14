.class public Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;
.super Ljava/lang/Object;
.source "ElementsFactory.java"


# static fields
.field public static typeNameNone:Ljava/lang/String; = "None"

# private static final Map<String, Class<? extends Element>> elementTypes = new LinkedHashMap<>();
.field private static elementTypes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;",
            ">;",
            ">;"
        }
    .end annotation
.end field


# .field public static final addableTypeNamesArray:[Ljava/lang/String;


# static {
#         elementTypes.put(typeNameNone, null);
# }

.method static constructor <clinit>()V
    .locals 3

    # getAddableTypeNames().toArray(new String[0]);

    # const/4 v0, 0x0
    # new-array v0,v0, [Ljava/lang/String;
    
    # invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->getAddableTypeNames()Ljava/util/Set;
    # move-result-object v1

    # invoke-interface {v1, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    # move-result-object v0

    # check-cast v0, [Ljava/lang/String;

    # # Store the resulting array in the addableTypeNamesArray field
    # sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->addableTypeNamesArray:[Ljava/lang/String;


    .line 18
    new-instance v0, Ljava/util/LinkedHashMap;
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V
    # invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->access$002(Ljava/util/Map;)Ljava/util/Map;´
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->elementTypes:Ljava/util/Map;

    .line 19
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->elementTypes:Ljava/util/Map;

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->typeNameNone:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    # elementTypes.put("Root", RootElement.class);
    # elementTypes.put("StatText", FpsTextElement.class);
    # elementTypes.put("AppLogo", LogoMark2.class);
    # elementTypes.put("AudioProvider", AudioDataProviderElement.class);
    # elementTypes.put("Text", TextElement.class);
    # elementTypes.put("Bars", SegmentElement.class);
    # elementTypes.put("Particles", ParticlesElement.class);
    # elementTypes.put("BlurEffect", BlurStackEffectElement.class);
    # elementTypes.put("Image", ImageElement.class);
    # elementTypes.put("RgbSplitEffect", RgbSplitEffectElement.class);
    # elementTypes.put("MotionBlurEffect", MotionBlurEffectElement.class);
    # elementTypes.put("DummyElement", DummyElement.class);
    # elementTypes.put("ColorCorrection", ColorCorrectionElement.class);
    # elementTypes.put("MirrorEffect", MirrorEffectElement.class);

    const-string v1, "Root"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    # composition

    const-string v1, "Composition"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Text"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Bars"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Particles"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Image"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AudioProvider"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "BlurEffect"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "RgbSplitEffect"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "MotionBlurEffect"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "MirrorEffect"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AppLogo"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    
    const-string v1, "StatText"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/FpsTextElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "DummyElement"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ColorCorrection"
    const-class v2, Lcom/daaw/avee/comp/Visualizer/Elements/ColorCorrectionElement;
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    return-void
.end method

# public static Element create(String typeName, String str2, Element element) {
#     Class<? extends Element> elementType = elementTypes.get(typeName);
#     if (elementType == null) {
#         tlog.w("Unknown typeName: " + typeName);
#         return element;
#     }
#     if (elementType.isInstance(element)) {
#         return element;
#     }
#     try {
#         return elementType.getDeclaredConstructor().newInstance();
#     } catch (Exception e) {
#         tlog.w("Failed to create element for typeName: " + typeName);
#         return element;
#     }
# }

.method public static create(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    .locals 9

    .line 23
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->elementTypes:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;


    # # elementType == null
    # if-eqz v0, :cond_0

    #     # tlog.w("Unknown typeName: " + typeName);
    #     # init stringbuilder

    #     new-instance v1, Ljava/lang/StringBuilder;
    #     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #     const-string v2, "Unknown typeName: "

    #     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    #     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    #     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    #     move-result-object v1

    #     invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    #     return-object p2

    # :cond_0


    # invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    # move-result v1

    # # elementType.isInstance(element)

    # if-nez v1, :cond_1
    #     return-object p2
    # :cond_1

    # # try {

    # :try_start_1
        
    #     invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructor()Ljava/lang/reflect/Constructor;

    #     move-result-object v1

    #     const/4 v2, 0x0

    #     new-array v2, v2, [Ljava/lang/Object;

    #     invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    #     move-result-object v1

    #     check-cast v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    #     return-object v1

    # :try_end_1
    # .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    # :catch_0
    # move-exception v1

    # # tlog.w("Failed to create element for typeName: " + typeName);

    # new-instance v2, Ljava/lang/StringBuilder;

    # invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    # const-string v3, "Failed to create element for typeName: "

    # invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    # invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    # invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    # move-result-object v2

    # invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V´









    # use cleaner method:

    # if (elementType != null && !elementType.isInstance(element)) {
    #     try {
    #         element = elementType.getDeclaredConstructor().newInstance();
    #     } catch (Exception e) {
    #         tlog.w("Failed to create element for typeName: " + typeName);
    #     }
    # } else if (elementType == null) {
    #     tlog.w("Unknown typeName: " + typeName);
    # }

    # return element;

    if-nez v0, :cond_0

    # tlog.w("Unknown typeName: " + typeName);

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown typeName: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    :cond_0
    
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :try_start_1
        
        # invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructor()Ljava/lang/reflect/Constructor;´

        const/4 v1, 0x0

        new-array v2, v1, [Ljava/lang/Class;

        invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

        move-result-object v1

        const/4 v2, 0x0

        new-array v2, v2, [Ljava/lang/Object;

        invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

        move-result-object v1

        check-cast v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

        return-object v1

    :try_end_1

    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0

    move-exception v1

    # tlog.w("Failed to create element for typeName: " + typeName);

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to create element for typeName: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    :cond_1

    return-object p2



.end method


# public static String getTypeName(Element element) {
#     if (element == null) {
#         return typeNameNone;
#     }
#     for (Map.Entry<String, Class<? extends Element>> entry : elementTypes.entrySet()) {
#         if (entry.getValue() != null && entry.getValue().isInstance(element)) {
#             return entry.getKey();
#         }
#     }
#     tlog.w("Unknown instance type");
#     return "unk";
# }

# convert once again to smali, without comments 

.method public static getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)Ljava/lang/String;

    .locals 5

    .line 28
    if-nez p0, :cond_0

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->typeNameNone:Ljava/lang/String;

    return-object v0

    :cond_0

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->elementTypes:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    if-eqz v2, :goto_0

    invoke-virtual {v2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :goto_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_2

    const-string v0, "Unknown instance type"

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    const-string v0, "unk"

    return-object v0

.end method


# public static Set<String> getAddableTypeNames() {
#     Set<String> addableTypeNames = new LinkedHashSet<>();
#     for (String typeName : elementTypes.keySet()) {
#         if (!typeName.equals(typeNameNone) && isTypeAddable(typeName)) {
#             addableTypeNames.add(typeName);
#         }
#     }
#     return addableTypeNames;
# }


.method public static getAddableTypeNames()Ljava/util/Set;

    .locals 8

    .line 34
    new-instance v0, Ljava/util/LinkedHashSet;
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 35
    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->elementTypes:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->typeNameNone:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :goto_0

    invoke-static {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->isTypeAddable(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :goto_0

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1

    return-object v0


.end method


# #  private static boolean isTypeAddable(String typeName) {
# #     String[] notAllowedTypes = {"Composition", "StatText", "DummyElement", "ColorCorrection"};
# #     for (String notAllowedType : notAllowedTypes) {
# #         if (typeName.equals(notAllowedType)) {
# #             return false;
# #         }
# #     }
# #     return true;
# # }

.method private static isTypeAddable(Ljava/lang/String;)Z

    .locals 8

    .line 40
    

    const/16 v0, 0x1
    new-array v0, v0, [Ljava/lang/String;

    # const/4 v1, 0x0
    # const-string v2, "Composition"
    # aput-object v2, v0, v1

    # const/4 v1, 0x1
    # const-string v2, "StatText"
    # aput-object v2, v0, v1

    # const/4 v1, 0x2
    # const-string v2, "DummyElement"
    # aput-object v2, v0, v1

    # const/4 v1, 0x3
    # const-string v2, "ColorCorrection"
    # aput-object v2, v0, v1

    const/4 v1, 0x0
    const-string v2, "Root"
    aput-object v2, v0, v1


    # for (String notAllowedType : notAllowedTypes) {
    #     if (typeName.equals(notAllowedType)) {
    #         return false;
    #     }
    # }


    move-object v1, v0

    array-length v2, v1

    move v3, v2

    const/4 v2, 0x0

    move v4, v2

    :goto_0

    if-ge v4, v3, :cond_1

    aget-object v2, v1, v4

    move-object v5, v2

    if-eqz v5, :cond_0

    invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0

    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_0

    :cond_1




    const/4 v0, 0x1
    return v0

.end method


# getAddableTypeNamesArray()  (string[])

.method public static getAddableTypeNamesArray()[Ljava/lang/String;

    .locals 3

    .line 46

    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Elements/ElementsFactory;->getAddableTypeNames()Ljava/util/Set;

    move-result-object v0

    # new String[0]

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    # invoke-interface {v0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0

.end method
