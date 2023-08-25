.class public final synthetic Lcom/daaw/em4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# static fields
.field public static final synthetic a:Lcom/daaw/em4;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/em4;

    invoke-direct {v0}, Lcom/daaw/em4;-><init>()V

    sput-object v0, Lcom/daaw/em4;->a:Lcom/daaw/em4;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/daaw/gm4;

    check-cast p1, Ljava/util/List;

    invoke-direct {v0, p1}, Lcom/daaw/gm4;-><init>(Ljava/util/List;)V

    return-object v0
.end method
