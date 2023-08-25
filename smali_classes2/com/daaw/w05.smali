.class public final synthetic Lcom/daaw/w05;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/b35;


# static fields
.field public static final synthetic a:Lcom/daaw/w05;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/w05;

    invoke-direct {v0}, Lcom/daaw/w05;-><init>()V

    sput-object v0, Lcom/daaw/w05;->a:Lcom/daaw/w05;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lcom/daaw/m75;->c:Lcom/daaw/j65;

    invoke-static {}, Lcom/daaw/yi8;->D()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
