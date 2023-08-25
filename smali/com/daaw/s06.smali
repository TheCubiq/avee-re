.class public final synthetic Lcom/daaw/s06;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# static fields
.field public static final synthetic a:Lcom/daaw/s06;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/s06;

    invoke-direct {v0}, Lcom/daaw/s06;-><init>()V

    sput-object v0, Lcom/daaw/s06;->a:Lcom/daaw/s06;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 1

    check-cast p1, Ljava/lang/String;

    new-instance v0, Lcom/daaw/r06;

    invoke-direct {v0, p1}, Lcom/daaw/r06;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
