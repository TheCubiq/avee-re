.class public final synthetic Lcom/daaw/yx3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iy3;


# static fields
.field public static final synthetic a:Lcom/daaw/yx3;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/yx3;

    invoke-direct {v0}, Lcom/daaw/yx3;-><init>()V

    sput-object v0, Lcom/daaw/yx3;->a:Lcom/daaw/yx3;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/x84;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, Lcom/daaw/x84;->zzc()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
