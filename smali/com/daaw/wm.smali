.class public final synthetic Lcom/daaw/wm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic p:Lcom/daaw/wm;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/wm;

    invoke-direct {v0}, Lcom/daaw/wm;-><init>()V

    sput-object v0, Lcom/daaw/wm;->p:Lcom/daaw/wm;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    invoke-static {p1, p2}, Lcom/daaw/ym;->a(Ljava/io/File;Ljava/io/File;)I

    move-result p1

    return p1
.end method
