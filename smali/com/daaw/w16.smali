.class public final synthetic Lcom/daaw/w16;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# static fields
.field public static final synthetic a:Lcom/daaw/w16;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/w16;

    invoke-direct {v0}, Lcom/daaw/w16;-><init>()V

    sput-object v0, Lcom/daaw/w16;->a:Lcom/daaw/w16;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    check-cast p1, Lcom/daaw/m5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/daaw/z16;

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-direct {p1, v0, v1}, Lcom/daaw/z16;-><init>(Ljava/lang/String;I)V

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/z16;

    invoke-virtual {p1}, Lcom/daaw/m5;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/m5;->b()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/z16;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    :goto_0
    return-object p1
.end method
