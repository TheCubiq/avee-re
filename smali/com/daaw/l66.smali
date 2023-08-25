.class public final synthetic Lcom/daaw/l66;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# static fields
.field public static final synthetic a:Lcom/daaw/l66;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/l66;

    invoke-direct {v0}, Lcom/daaw/l66;-><init>()V

    sput-object v0, Lcom/daaw/l66;->a:Lcom/daaw/l66;

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

    check-cast p1, Ljava/lang/Exception;

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lcom/daaw/n66;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/daaw/n66;-><init>(Ljava/lang/String;)V

    return-object p1
.end method
